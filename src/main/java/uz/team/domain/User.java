package uz.team.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder
@Table(name = "auth_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String fullName;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
    private Integer phoneNumber;

//    private Card;

    public enum Role {
        ADMIN, USER;
    }
}
