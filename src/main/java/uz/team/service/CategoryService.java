package uz.team.service;

import uz.team.domain.Category;
import uz.team.dto.CategoryDTO;

import javax.servlet.http.HttpServletRequest;
import java.util.function.Function;

public class CategoryService extends Service<CategoryDTO> {
    protected CategoryService(CategoryDTO dao) {
        super(dao);
    }

    public void create(HttpServletRequest request){
        CategoryDTO categoryDTO=CategoryDTO.builder()
                .name(request.getParameter("name"))
                .build();
    }





    private static final Function<CategoryDTO, Category> ToDomain=Category::toDomain;

}
