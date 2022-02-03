### How to use this spring-boot project

- Install packages with `mvn package`
- Run `mvn spring-boot:run` for starting the application (or use your IDE)

Application (with the embedded H2 database) is ready to be used ! You can access the url below for testing it :

- Swagger UI : http://localhost:8082/swagger-ui.html
- H2 UI : http://localhost:8082/h2-console

- Set the `JDBC URL` value as `jdbc:h2:mem:testdb` for H2 UI.

### Instruction to start the Application ###
- Tomcat Port has been changed to 8082, So please change the port while starting Swagger/H2 while testing.
- Use User/pass => testuser/testpassword as authentication credential to generate Bearer Token. 
  Authorize your endpoints by clicking Authenticate button in Swagger UI and pass the API Key : Bearer <generated token>

 