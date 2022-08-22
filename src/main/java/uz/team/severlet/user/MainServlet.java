package uz.team.severlet.user;


import uz.team.container.ApplicationContext;
import uz.team.service.product.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(value = "/")
public class MainServlet extends HttpServlet {
    private final ProductService service= ApplicationContext.getBean(ProductService.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/main/Main.jsp");
        boolean loggedId = Objects.isNull(req.getSession().getAttribute("userId"));
        req.setAttribute("loggedId", loggedId);
        req.setAttribute("products",service.getAll());
        requestDispatcher.forward(req,resp);
    }
}
