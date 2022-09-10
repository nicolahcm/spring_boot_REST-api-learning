package com.example.demo.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
public class StudentConfig {

    // private final Test test;

    public StudentConfig() {
        //this.test = test;
        System.out.println("CIAO A TUTTI FUNZIONO");
    }


    @Bean  // questo rende il metodo successivo un bean chiamato
    // do something. Vedi nella lista dei beans che trovi doSomething. Puoi cambiargli nome con parametri in @Bean...
    // Inoltre, questo Bean ha delle dipendenze. Se i Bean hanno delle dipendenze,
    String doSomething(StudentRepository studentRepository) {
        System.out.println("Hi" + studentRepository);
        return "Hi Metodo del Bean elaborato!";
    }

}
