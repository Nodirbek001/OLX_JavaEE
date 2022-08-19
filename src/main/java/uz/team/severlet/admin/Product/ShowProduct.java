package uz.team.severlet.admin.Product;

import uz.team.container.ApplicationContext;
import uz.team.service.product.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/show")
public class ShowProduct extends HttpServlet {
    private final ProductService service = ApplicationContext.getBean(ProductService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("allProduct", service.getAll());
        req.getRequestDispatcher("/views/main/admin/product/show_product.jsp").forward(req, resp);
    }
}
