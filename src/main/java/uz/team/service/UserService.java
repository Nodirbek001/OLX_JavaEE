package uz.team.service;

import uz.team.dao.UserDAO;
import uz.team.dto.prodact.ProductDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;

public class UserService extends Service<UserDAO> {
    protected UserService(UserDAO dao) {
        super(dao);
    }


}
