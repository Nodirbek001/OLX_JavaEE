package uz.team.service;

import uz.team.dao.UserDAO;

import javax.servlet.http.HttpServlet;

public class UserService extends Service<UserDAO >{
    protected UserService(UserDAO dao) {
        super(dao);
    }
    public void create(HttpServlet req){

    }
}
