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

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String fullName;
    private String username;
    private String password;
    private Role role;
    @OneToOne
    private Card card;

    public enum Role {
        ADMIN, USER;
    }
}
