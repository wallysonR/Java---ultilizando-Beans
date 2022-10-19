package com.springbeans.ultilizandoBeans;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Livro livro = factory.getBean(Livro.class);
        Autor autor = factory.getBean(Autor.class);
        Autor auto = factory.getBean(Autor.class);
        Livro livr = factory.getBean(Livro.class);
        livro.setNome("Vigiar e Punir");
        livro.setCodigo("bn912");
        autor.setNome("Michel Foucault");
        livr.setNome("Madame Bovary");
        livr.setCodigo("bn913");
        auto.setNome("Gustave Flaubert");
        livro.exibir();
        livr.exibir();
        try {
            factory.close();
        } finally {
            System.out.println("ERROR");
        }
    }
}
