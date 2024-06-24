package dev.sana.Splitwise.Controller;

import dev.sana.Splitwise.DTO.UserRegitrationRequestDTO;
import dev.sana.Splitwise.Entity.User;
import dev.sana.Splitwise.Exception.UserRegistrationInvalidDataException;
import dev.sana.Splitwise.Mapper.EntityDtoMapper;
import dev.sana.Splitwise.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/signup")
    public ResponseEntity singnUp(@RequestBody UserRegitrationRequestDTO userRegitrationRequestDTO){
        validateUserRegistrationRequesDTO(userRegitrationRequestDTO);
        User savedUser = userService.signUp(userRegitrationRequestDTO.getName(),userRegitrationRequestDTO.getEmail(),userRegitrationRequestDTO.getPassword());
        return ResponseEntity.ok(
                EntityDtoMapper.toDTO(savedUser)
        );

    }

    private void validateUserRegistrationRequesDTO(UserRegitrationRequestDTO requestDTO){
        if(requestDTO.getName()== null ||
        requestDTO.getEmail()==null ||
        requestDTO.getPassword() == null){
            throw new UserRegistrationInvalidDataException("Invalid sign up data");
        }
    }
}
