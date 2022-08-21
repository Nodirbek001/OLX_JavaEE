package uz.team.severlet.user;

import uz.team.container.ApplicationContext;
import uz.team.dto.user.RegisterDTO;
import uz.team.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(value = "/show/profile")
public class MyProfileServlet extends HttpServlet {



    public final UserService userService = ApplicationContext.getBean(UserService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        boolean loggedId = Objects.isNull(req.getSession().getAttribute("userId"));
        if (!loggedId)
            req.getRequestDispatcher("/views/main/user/edit-show_profile.jsp").forward(req,resp);
        else
            req.getRequestDispatcher("/views/login/register.jsp").forward(req,resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RegisterDTO dto = RegisterDTO.builder()
                .fullName(req.getParameter("fullName"))
                .phoneNumber(Integer.valueOf(req.getParameter("phoneNumber")))
                .email(req.getParameter("email"))
                .username(req.getParameter("username"))
                .password(req.getParameter("password"))
                .build();
        userService.editUser(Long.valueOf(req.getParameter("userId")),dto);
        resp.sendRedirect("/");
    }
}
