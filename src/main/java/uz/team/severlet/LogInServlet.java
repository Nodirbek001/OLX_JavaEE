package uz.team.severlet;


import uz.team.container.ApplicationContext;
import uz.team.domain.User;
import uz.team.dto.user.LoginDTO;
import uz.team.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/auth/login")
public class LogInServlet extends HttpServlet {
    public final UserService userService = ApplicationContext.getBean(UserService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/login/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginDTO loginDTO = LoginDTO.builder()
                .username(req.getParameter("username"))
                .password(req.getParameter("password"))
                .build();
        User login = userService.login(loginDTO);
        HttpSession session = req.getSession();
        session.setAttribute("userId", login.getId());
        User.Role userRole = login.getRole();
        switch (userRole) {
            case USER -> resp.sendRedirect("/");
            case ADMIN -> resp.sendRedirect("/views/main/admin/AdminPage.jsp");
        }
    }
}
