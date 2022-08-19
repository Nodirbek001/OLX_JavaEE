package uz.team.domain;

import jakarta.persistence.*;
import lombok.*;
import uz.team.dto.prodact.ProductDTO;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;
    @OneToOne
    private Uploads uploade;
    @OneToOne
    private Category category;
    @OneToOne
    private User user;
    private boolean isdelete = false;
    private String title;

    public static Product ToDomain(ProductDTO productDTO) {
        return Product.builder()
                .name(productDTO.getProductName())
                .category(productDTO.getCategory())
                .price(productDTO.getPrice())
                .title(productDTO.getTitle())
                .uploade(productDTO.getUploade())
                .user(productDTO.getUser())
                .build();
    }
}
