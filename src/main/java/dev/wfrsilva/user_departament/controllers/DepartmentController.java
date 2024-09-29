package dev.wfrsilva.user_departament.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.wfrsilva.user_departament.entities.Department;
import dev.wfrsilva.user_departament.repositories.DepartmentRepository;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository dpRepository;

    @GetMapping
    public List<Department> findAll() {
        List<Department> result = dpRepository.findAll();
        return result;
    }// findAll

    @GetMapping(value = "/{id}")
    public Department findById(@PathVariable Long id) {
        Department result = dpRepository.findById(id).get();
        return result;
    }// findAll

    @PostMapping
    public Department insert(@RequestBody Department department) {
        Department result = dpRepository.save(department);
        return result;
    }// findAll 
}//DepartmentController
