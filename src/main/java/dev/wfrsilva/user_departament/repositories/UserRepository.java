package dev.wfrsilva.user_departament.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.wfrsilva.user_departament.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}//UserRepository
