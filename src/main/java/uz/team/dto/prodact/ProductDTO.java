package uz.team.dto.prodact;

import lombok.*;
import uz.team.domain.Uploade;
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
    private Uploade uploade;
    private User user;
    private String title;
}
