package uz.team.service.product;

import uz.team.dao.CategoryDAO;
import uz.team.dao.ProductDao;
import uz.team.dao.UserDAO;
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

    protected ProductService(ProductDao dao) {
        super(dao);
    }


    public BadRequestException create(HttpServletRequest req) throws ServletException, IOException {
        Part file = req.getPart("file");
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductName(req.getParameter("name"));
        productDTO.setPrice(Integer.parseInt(req.getParameter("price")));
        String username = req.getParameter("username");
        UserDAO userDAO = null;
        Optional<User> byUsername = userDAO.findByUsername(username);
        if (byUsername.isEmpty()){
            return new BadRequestException("Username invalid");
        }
        productDTO.setUser(userDAO.findByUsername1(username));
        productDTO.setCategory(req.getParameter("category"));
        UploadsDTO uploadsDTO = UploadsDTO.ToDTO(file);
        Uploads uploads = Uploads.ToDomain(uploadsDTO);
        productDTO.setUploade(uploads);
        productDTO.setTitle(req.getParameter("title"));
Product produc=Product
        return
    }
}
