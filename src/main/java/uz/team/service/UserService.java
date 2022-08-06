package uz.team.service;

import uz.team.dao.UserDAO;
import uz.team.domain.User;
import uz.team.dto.user.LoginDTO;
import uz.team.dto.user.RegisterDTO;
import uz.team.exceptions.BadRequestException;
import uz.team.util.Utils;

import javax.servlet.http.HttpServlet;
import java.util.Objects;

public class UserService extends Service<UserDAO >{
    public UserService(UserDAO dao) {
        super(dao);
    }
    public void create(RegisterDTO dto){
        if (Objects.isNull(dto.getUsername())) {
            throw new BadRequestException("Username can not be null");
        }
//        if (Objects.equals(dto.getUsername(),)) {
//            throw new BadRequestException("Password can not be null");
//        }
        if (Objects.isNull(dto.getPassword())) {
            throw new BadRequestException("Password can not be null");
        }
        if (!Objects.equals(dto.getPassword(),dto.getConfirmPassword())){
            throw new BadRequestException("Password did not match");
        }

        User users = dto.toUser();
        dao.create(users);
    }

    public User login(LoginDTO loginDTO) {
        User user = dao.findByUsername(loginDTO.getUsername()).orElseThrow(() -> {
            throw new BadRequestException("Bad credentials");
        });
        if (!Utils.matchPassword(loginDTO.getPassword(),user.getPassword())) {
            throw new BadRequestException("Bad credentials");
        }
        return user;
    }
}
