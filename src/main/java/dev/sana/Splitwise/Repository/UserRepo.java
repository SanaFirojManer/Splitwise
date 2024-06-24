package dev.sana.Splitwise.Repository;

import dev.sana.Splitwise.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
