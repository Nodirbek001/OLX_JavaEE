package uz.team.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import uz.team.dto.UploadsDTO;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Uploads {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String originalName;
    private String generatedName;
    private String contentType;
    private long size;

    public static Uploads ToDomain(UploadsDTO uploadsDTO) {
        return Uploads.builder()
                .generatedName(uploadsDTO.getGeneratedName())
                .originalName(uploadsDTO.getOriginalName())
                .contentType(uploadsDTO.getContentType())
                .size(uploadsDTO.getSiz())
                .build();
    }
}
