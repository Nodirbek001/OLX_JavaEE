package uz.team.container;


import uz.team.dao.CategoryDAO;
import uz.team.dao.ProductDao;
import uz.team.dao.UserDAO;
import uz.team.service.CategoryService;
import uz.team.service.Service;
import uz.team.service.UserService;
import uz.team.service.product.ProductService;

public class ApplicationContext extends Service<UserDAO> {

    public ApplicationContext(UserDAO dao) {
        super(dao);
    }

    private static final UserDAO userDAO = new UserDAO();
    private static final ProductDao productDao = new ProductDao();

    private static final CategoryDAO categoryDao=new CategoryDAO();

    private static final UserService authUserService = new UserService(userDAO);
    private static final ProductService productService = new ProductService(productDao);
    private static final CategoryService categoryService=new CategoryService(categoryDao);


    @SuppressWarnings("raw_types")
    public static <T> T getBean(Class<T> clazz) {
        return switch (clazz.getSimpleName()) {
            case "UserService" -> (T) authUserService;
            case "ProductService" ->(T) productService;
            case "CategoryService" ->(T) categoryService;
            default -> throw new RuntimeException("Bean not found");
        };
    }
}
