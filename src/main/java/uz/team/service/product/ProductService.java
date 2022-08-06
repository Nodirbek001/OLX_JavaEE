package uz.team.service.product;

import uz.team.dao.ProductDao;
import uz.team.dao.UserDAO;
import uz.team.domain.Uploade;
import uz.team.domain.User;
import uz.team.dto.prodact.ProductDTO;
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


    public void create(HttpServletRequest req) throws ServletException, IOException {
        Part file = req.getPart("file");
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductName(req.getParameter("name"));
        productDTO.setPrice(Integer.parseInt(req.getParameter("price")));
        String username = req.getParameter("username");
        UserDAO userDAO = null;
        User byUsername = userDAO.findByUsername(username);
        productDTO.setUser(byUsername);
        productDTO.setCategory(req.getParameter("category"));
        Uploade uploade=Uploade.builder()
                .generatedName()
        uploade.
        productDTO.set;
    }
}
