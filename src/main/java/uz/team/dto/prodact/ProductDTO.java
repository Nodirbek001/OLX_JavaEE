package uz.team.dto.prodact;

import lombok.*;
import uz.team.domain.Uploade;
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
    private String username;
}
