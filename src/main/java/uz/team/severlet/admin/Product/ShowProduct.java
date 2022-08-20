package uz.team.severlet.admin.Product;

import uz.team.container.ApplicationContext;
import uz.team.domain.Product;
import uz.team.service.CategoryService;
import uz.team.service.product.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/show")
public class ShowProduct extends HttpServlet {
    private final ProductService service = ApplicationContext.getBean(ProductService.class);
    private final CategoryService categoryService=ApplicationContext.getBean(CategoryService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("categories", categoryService.getALl());
        if (req.getParameter("isEmpty") != null) {
            req.setAttribute("all", service.getAll());
        }
        req.getRequestDispatcher("/views/main/admin/product/show_product.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String pricemax = req.getParameter("pricemax");
        String pricemin = req.getParameter("pricemin");
        String category = req.getParameter("category");
        System.out.println(pricemax);
        System.out.println(name);
        List<Product> filter = service.filter(name, pricemin, pricemax, category);
        req.removeAttribute("all");
        req.setAttribute("all",filter);
        req.setAttribute("isEmpty",false);
        resp.sendRedirect("/views/main/admin/product/show_product.jsp");
    }
}
