package com.example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PortfolioController {
    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to My Portfolio</h1>" +
               "<p>Name: Your Name</p>" +
               "<p>Skills: Java, DevOps, Maven, Docker, Jenkins, Kubernetes</p>";
    }
    @GetMapping("/about")
    public String about() {
        return "I am a student learning DevOps - Maven, Jenkins, Docker, Kubernetes.";
    }
}

