package uz.team.dto;

import lombok.*;
import uz.team.domain.Category;

import javax.servlet.http.HttpServletRequest;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDTO {
    private String name;

    public static CategoryDTO toDTO(HttpServletRequest category) {
        return CategoryDTO.builder()
                .name(category.getParameter("category"))
                .build();
    }
}

