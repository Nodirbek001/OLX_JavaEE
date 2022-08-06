package uz.team.service;

import uz.team.dao.CategoryDAO;
import uz.team.domain.Category;
import uz.team.dto.CategoryDTO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.function.Function;

public class CategoryService extends Service<CategoryDAO> {


    public CategoryService(CategoryDAO dao) {
        super(dao);
    }

    public void create(HttpServletRequest request){
        CategoryDTO categoryDTO=ToDto.apply(request);
        Category category=ToDomain.apply(categoryDTO);
        dao.create(category);

    }

    public List<Category> getALl(){
        return dao.findAll();
    }

    public void delete(){

    }

    public Category FindByName(String categoryName){
        return dao.findByName(categoryName);
    }





    private static final Function<HttpServletRequest, CategoryDTO> ToDto=CategoryDTO::toDTO;
    private static final Function<CategoryDTO, Category> ToDomain=Category::toDomain;

}
