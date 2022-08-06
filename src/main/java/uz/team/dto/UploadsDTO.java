package uz.team.dto;

import lombok.*;
import uz.team.util.Utils;

import javax.servlet.http.Part;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UploadsDTO {
    private String originalName;
    private String generatedName;
    private String contentType;
    private Long siz;

    public static UploadsDTO ToDTO(Part part) {
        return
                UploadsDTO.builder()
                        .generatedName(Utils.generateUniqueFileName())
                        .originalName(part.getSubmittedFileName())
                        .siz(part.getSize())
                        .contentType(part.getContentType())
                        .build();
    }
}
