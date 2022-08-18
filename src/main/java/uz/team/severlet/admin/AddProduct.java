package uz.team.severlet.admin;

import uz.team.container.ApplicationContext;
import uz.team.service.CategoryService;
import uz.team.service.product.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add/product")
@MultipartConfig
public class AddProduct extends HttpServlet {
    private final ProductService productService = ApplicationContext.getBean(ProductService.class);
    private final CategoryService categoryService = ApplicationContext.getBean(CategoryService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("categories", categoryService.getALl());
        req.getRequestDispatcher("/views/main/admin/product/add_product.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        productService.create(req);
        resp.sendRedirect("/admin/page");

    }

}
