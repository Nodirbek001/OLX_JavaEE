package uz.team.dto.user;

import lombok.*;
import uz.team.domain.User;
import uz.team.util.Utils;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class LoginDTO {
    private String username;
    private String password;

    public User toUser(){
        return User.builder()
                .username(this.username)
                .password(Utils.encodePassword(password))
                .build();
    }
}
