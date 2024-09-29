package dev.wfrsilva.user_departament.entities;

public class Department {

    private Long id;
   
    private String name;

    public Department(){

    }//construtor

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
}//Departament
