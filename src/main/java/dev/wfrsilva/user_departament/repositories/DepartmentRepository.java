package dev.wfrsilva.user_departament.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.wfrsilva.user_departament.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
    
}//DepartamentRepository
