# spring-boot-intro

# Intro

This is a demo project to showcase basic Spring Boot capabilities for learning purposes.

# Usage

Run the `SpringBootIntroApplication` class or its main function.

Then open Postman and test the following requests:

```
GET http://localhost:8080/hello/dog/John?lastName=Doe
```

```
POST http://localhost:8080/hello/dog

Body:
{
  "hello": "Heya!",
  "world": "Dog"
}
```