package dev.sana.Splitwise.ServiceImpl;

import dev.sana.Splitwise.Entity.User;
import dev.sana.Splitwise.Repository.UserRepo;
import dev.sana.Splitwise.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public User signUp(String name, String email, String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
       User user = new User();
       user.setName(name);
       user.setEmail(email);
       user.setPassword(encoder.encode(password));
        return userRepo.save(user);
    }
}
