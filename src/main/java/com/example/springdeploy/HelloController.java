package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${app.message}")
    String message;
    @GetMapping("/hola")
    public String holaMundo(){
        System.out.println(message);
        return "Hola mundo que tal vamos!!! Hasta luego!";
    }
    @GetMapping("/bootstrap")
    public String bootstrap(){
        return """
                         <!doctype html>
                         <html lang="en">
                           <head>
                             <meta charset="utf-8">
                             <meta name="viewport" content="width=device-width, initial-scale=1">
                             <title>Hello, world!</title>
                             <a class="btn btn-primary" href="http://www.google.com"> Google </a>
                             <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
                           </head>
                           <body>
                             <h1>Hola mundo desde Spring Boot!</h1>
                             <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
                           </body>
                         </html>        
                """;
    }
}
