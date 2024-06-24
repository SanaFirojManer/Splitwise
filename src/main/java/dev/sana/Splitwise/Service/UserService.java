package dev.sana.Splitwise.Service;

import dev.sana.Splitwise.Entity.User;

public interface UserService {

    User signUp(String name, String email, String password );
}
