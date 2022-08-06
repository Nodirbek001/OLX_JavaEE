package uz.team.dto.prodact;

import lombok.*;
import uz.team.domain.Category;
import uz.team.domain.Uploads;
import uz.team.domain.User;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProductDTO {
    private String productName;
    private int price;
    private String category;
    private Uploads uploade;
    private User user;
    private String title;
}
