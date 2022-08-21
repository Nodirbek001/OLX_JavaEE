package uz.team.service.product;

import org.hibernate.Session;
import uz.team.config.HibernateConfigurer;
import uz.team.dao.CategoryDAO;
import uz.team.dao.ProductDao;
import uz.team.dao.UserDAO;
import uz.team.domain.Category;
import uz.team.domain.Product;
import uz.team.domain.User;
import uz.team.dto.prodact.ProductDTO;
import uz.team.exceptions.BadRequestException;
import uz.team.service.CategoryService;
import uz.team.service.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ProductService extends Service<ProductDao> {

    public ProductService(ProductDao dao) {
        super(dao);
    }


    public void create(HttpServletRequest req) throws ServletException, IOException {
        Long userId = (Long) req.getSession().getAttribute("userId");
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductName(req.getParameter("name"));
        productDTO.setPrice(Integer.parseInt(req.getParameter("price")));
        UserDAO userDAO = new UserDAO();
        Optional<User> byUsername = Optional.ofNullable(userDAO.findById(Math.toIntExact(userId)));
        if (byUsername.isEmpty()) {
            throw new RuntimeException(new BadRequestException("dw"));
        }
        productDTO.setUser(userDAO.findById(Math.toIntExact(userId)));
        CategoryDAO CategoryDAO = new CategoryDAO();
        CategoryService categoryService = new CategoryService(CategoryDAO);
        Category category = categoryService.FindByName(req.getParameter("category"));
        productDTO.setCategory(category);

//        Part file = req.getPart("file");
//        UploadsDTO uploadsDTO = UploadsDTO.ToDTO(file);
//        Uploads uploads = Uploads.ToDomain(uploadsDTO);
//        productDTO.setUploade(uploads);
        productDTO.setTitle(req.getParameter("title"));
        Product product = Product.ToDomain(productDTO);
        dao.create(product);
    }


    public List<Product> getAll() {
        return dao.findAll();
    }

    public List<Product> filter(String name, String pricemin, String pricemax, String category) {
        List<Product> all = getAll();
        System.out.println(name);
        System.out.println(pricemax);
        System.out.println(pricemin);
        if (!name.isBlank()) {
            all.stream().filter(product -> product.getName().equals(name));
        }
        if (Integer.parseInt(pricemax)>0 && Integer.parseInt(pricemin)>0 && Integer.parseInt(pricemax)>Integer.parseInt(pricemin))
            all.stream().filter(product -> product.getPrice()>Integer.parseInt(pricemin) && product.getPrice()<Integer.parseInt(pricemax));
        return all;

    }
}
