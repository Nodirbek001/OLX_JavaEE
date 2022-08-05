package uz.team.service;

import uz.team.dao.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;

public class UserService extends Service<UserDAO> {
    protected UserService(UserDAO dao) {
        super(dao);
    }

    public void create(HttpServletRequest req) throws ServletException, IOException {
        Part file = req.getPart("file");

    }
}
