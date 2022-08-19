package uz.team.severlet.admin.category;

import uz.team.container.ApplicationContext;
import uz.team.service.CategoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/show/category")
public class ShowCategory extends HttpServlet {
    private final CategoryService categoryService = ApplicationContext.getBean(CategoryService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("categories", categoryService.getALl());
        req.getRequestDispatcher("/views/main/admin/category/ShowCategory.jsp").forward(req,
                resp);

    }
}
