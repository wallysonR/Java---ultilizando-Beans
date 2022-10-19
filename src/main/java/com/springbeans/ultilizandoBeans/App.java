package com.springbeans.ultilizandoBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Livro livro = factory.getBean(Livro.class);
        Autor autor = factory.getBean(Autor.class);
        livro.setNome("Vigiar e Punir");
        livro.setCodigo("bn912");
        autor.setNome("Michel Foucault");
        livro.exibir();
        ((AbstractApplicationContext) factory).close();
        System.out.println("Teste");
    }
}
