package uz.team.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Uploade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String originalName;
    private String generatedName;
    private String contentType;
    private long size;

//    public static Uploade toDomain(UploadsDTO dto) {
//        return Uploade.builder()
//                .originalName(dto.getOriginalName())
//                .generatedName(dto.getGeneratedName())
//                .contentType(dto.getContentType())
//                .size(dto.getSize())
//                .build();
//    }
}
