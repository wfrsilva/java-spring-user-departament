# java-spring-user-departament
API REST com banco de dados usando Java e Spring Boot

#video aula
[Seu primeiro projeto Java web no Spring Boot](https://www.youtube.com/watch?v=D4frmIHAxEY&ab_channel=DevSuperior)

#Mais info
- [github - java-web-spring-2022](https://github.com/devsuperior/java-web-spring-2022)
- [Spring Initializr](https://start.spring.io/)
- git remote set-url origin https://<<jSLSI10pehp9JOgjBRhx2vgWUIfiywZmveP3_phg>>@github.com/wfrsilva/java-spring-user-departament.git


### Visão geral do sistema

Vamos construir um pequeno sistema (API REST) de usuários e departamentos, com os seguintes casos de uso:

- Buscar todos usuários
- Buscar um usuário pelo seu id
- Inserir um novo usuário

![Image](https://raw.githubusercontent.com/devsuperior/java-web-spring-2022/main/img/dominio.png "Modelo conceitual")

### Desenvolvimento moderno: relacional -> objeto -> json

![Image](https://raw.githubusercontent.com/devsuperior/java-web-spring-2022/main/img/objetos.png "Objetos")

### Passos da aula

- Criar o projeto
- Implementar o modelo de domínio
- Mapeamento objeto-relacional com JPA
- Configurar o banco de dados H2
- Criar os endpoints da API REST

### Trechos de código para copiar

#### Configuração do Maven Resources Plugin

```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version>
</plugin>
```

#### Configurações do banco de dados

```
# Dados de conexão com o banco H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# Configuração do cliente web do banco H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Configuração para mostrar o SQL no console
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

#### Script SQL

```sql
INSERT INTO tb_department(name) VALUES ('Gestão');
INSERT INTO tb_department(name) VALUES ('Informática');

INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Maria', 'maria@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Bob', 'bob@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Alex', 'alex@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Ana', 'ana@gmail.com');
```
#### Collection Postman

https://www.getpostman.com/collections/ac4a49113c4024e47d4f

Inicialmente vou usar o plugin VScode Rest client como usei no projeto [first-spring-app](https://github.com/wfrsilva/first-spring-app/)


**Cuidado com a barra no users/**


![image](https://github.com/user-attachments/assets/1693d42e-5ebf-4d04-8c28-c72f002c108b)
![image](https://github.com/user-attachments/assets/b771de8e-8599-4ccb-aac3-7a1b23138657)
![image](https://github.com/user-attachments/assets/b7431191-2a3a-44ed-af44-97771aa7abeb)




### Visualizacoes
![image](https://github.com/user-attachments/assets/6adef3ea-2a96-4a64-a80f-5f04e12f0bdb)


![image](https://github.com/user-attachments/assets/03b3e4c2-b402-44e5-8a5b-2389712b5d78)

http://localhost:8080/h2-console/

jdbc:h2:mem:testdb

![image](https://github.com/user-attachments/assets/bcaefa4c-3e3b-443f-9a86-3e6c0ebbab28)

![image](https://github.com/user-attachments/assets/e1e16d0d-015f-4534-bb9d-07ceb819ffc6)


![image](https://github.com/user-attachments/assets/1c52e9d1-2460-4d73-98f8-6fa3fc801e23)

http://localhost:8080/users

![image](https://github.com/user-attachments/assets/2f8c1a65-722f-496f-9817-d1de16209daf)

http://localhost:8080/users/4


codorna.http
```
#POST http://10.255.255.254:8080/users/ #com barra da erro
POST http://localhost:8080/users
Content-Type: application/json

{
  "name": "codorna",
  "email": "codorna@gmail.com",
  "department": {
    "id": 2
  }
}
```
![image](https://github.com/user-attachments/assets/853907de-eee0-4fd6-a65f-1166f973c1db)
![image](https://github.com/user-attachments/assets/f17d0003-19b8-463c-b15c-982617fd0194)
![image](https://github.com/user-attachments/assets/ef46af6e-3b34-48dd-9230-665fc588888f)


### Extras
Configurado Departamento para ser listado (GET) e ser criado (POST)
 - controllers/DepartmentController.java
 - repositories/DepartmentRepository.java

http://localhost:8080/departments
http://localhost:8080/departments/1

