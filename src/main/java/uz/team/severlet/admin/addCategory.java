package uz.team.severlet.admin;

import uz.team.container.ApplicationContext;
import uz.team.service.CategoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/add/category")
public class addCategory extends HttpServlet {
    public static final CategoryService category= ApplicationContext.getBean(CategoryService.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/main/admin/product/Add_category.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        category.create(req);
        resp.sendRedirect("/admin/page");

    }
}
