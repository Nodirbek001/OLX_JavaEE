package uz.team.container;


import uz.team.dao.UserDAO;
import uz.team.service.Service;
import uz.team.service.UserService;

public class ApplicationContext extends Service<UserDAO> {

    public ApplicationContext(UserDAO dao) {
        super(dao);
    }

    private static final UserDAO userDAO = new UserDAO();

    private static final UserService authUserService = new UserService(userDAO);


    @SuppressWarnings("raw_types")
    public static <T> T getBean(Class<T> clazz) {
        return switch (clazz.getSimpleName()) {
            case "UserService" -> (T) authUserService;
            default -> throw new RuntimeException("Bean not found");
        };
    }
}
