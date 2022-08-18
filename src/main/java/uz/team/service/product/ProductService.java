package uz.team.service.product;

import uz.team.dao.CategoryDAO;
import uz.team.dao.ProductDao;
import uz.team.dao.UserDAO;
import uz.team.domain.Category;
import uz.team.domain.Product;
import uz.team.domain.Uploads;
import uz.team.domain.User;
import uz.team.dto.UploadsDTO;
import uz.team.dto.prodact.ProductDTO;
import uz.team.exceptions.BadRequestException;
import uz.team.service.CategoryService;
import uz.team.service.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Optional;

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

        Part file = req.getPart("files");
        UploadsDTO uploadsDTO = UploadsDTO.ToDTO(file);
        Uploads uploads = Uploads.ToDomain(uploadsDTO);
        productDTO.setUploade(uploads);


        productDTO.setTitle(req.getParameter("title"));
        Product product = Product.ToDomain(productDTO);
        dao.create(product);
    }
}
