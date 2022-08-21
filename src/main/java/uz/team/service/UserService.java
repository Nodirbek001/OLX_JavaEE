package uz.team.service;

import lombok.NonNull;
import uz.team.dao.UserDAO;
import uz.team.domain.User;
import uz.team.dto.user.LoginDTO;
import uz.team.dto.user.RegisterDTO;
import uz.team.exceptions.BadRequestException;
import uz.team.util.Utils;

import javax.servlet.http.HttpServlet;
import java.util.Objects;
import java.util.Optional;

public class UserService extends Service<UserDAO >{
    public UserService(UserDAO dao) {
        super(dao);
    }

    public void create(@NonNull RegisterDTO dto) {

        if (Objects.isNull(dto.getPassword()))
            throw new BadRequestException("Password can not be null");

        if (!Objects.equals(dto.getPassword(), dto.getConfirmPassword()))
            throw new BadRequestException("Password did not match");

       User authUser = dto.toUser();
        dao.create(authUser);
    }

    public User login(LoginDTO loginDTO){
        User user = dao.findByUsername(loginDTO.getUsername()).orElseThrow(() -> {
            throw new BadRequestException("Bad credentials");
        });
        if (!Utils.matchPassword(loginDTO.getPassword(),user.getPassword())) {
            throw new BadRequestException("Bad credentials");
        }
        return user;
    }
    public User findUserByUsername(String username){
        User users=dao.findByUsername(username).orElseThrow(()->{
            throw new BadRequestException("Not found User");
        });
        return users;
    }

    public void editUser(Long id,RegisterDTO dto){

//        Optional<User> byUsername = dao.findByUsername(dto.getUsername());
        User byUsername = dao.findById(Math.toIntExact(id));

        if (!Objects.isNull(dto.getFullName())){
            byUsername.setFullName(dto.getFullName());
        }
        if (!Objects.isNull(dto.getPhoneNumber())){
            byUsername.setPhoneNumber(dto.getPhoneNumber());
        }
        if (!Objects.isNull(dto.getEmail())){
            byUsername.setEmail(dto.getEmail());
        }
        if (!Objects.isNull(dto.getUsername())){
            byUsername.setUsername(dto.getUsername());
        }
        if (!Objects.isNull(dto.getPassword())){
            byUsername.setPassword(dto.getPassword());
        }

        dao.update(id,byUsername);
    }


}
