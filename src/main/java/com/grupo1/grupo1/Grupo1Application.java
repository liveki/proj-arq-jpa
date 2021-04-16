package com.grupo1.grupo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.grupo1" })
@EntityScan(basePackages = { "com.grupo1" })
public class Grupo1Application {

  public static void main(String[] args) {
    SpringApplication.run(Grupo1Application.class, args);
  }

}
