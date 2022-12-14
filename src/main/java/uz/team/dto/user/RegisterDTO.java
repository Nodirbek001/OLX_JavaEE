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
public class RegisterDTO {
    private String fullName;
    private String username;
    private String password;
    private String confirmPassword;
    private String email;
    private Integer phoneNumber;

    public User toUser(){
        return User.builder()
                .fullName(this.fullName)
                .phoneNumber(this.phoneNumber)
                .email(this.email)
                .username(this.username)
                .password(Utils.encodePassword(password))
                .role(User.Role.USER)
                .build();
    }
}
