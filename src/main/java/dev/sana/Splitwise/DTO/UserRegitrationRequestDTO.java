package dev.sana.Splitwise.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegitrationRequestDTO {

    private String name;
    private String email;
    private String password;
}