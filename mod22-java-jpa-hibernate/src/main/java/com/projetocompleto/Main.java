package com.projetocompleto;

import com.projetocompleto.dominio.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        // Inserindo Dados
        /*Pessoa p1 = new Pessoa(null, "Carlito", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null, "Vitor", "vitor@gmail.com");
        Pessoa p3 = new Pessoa(null, "Joana", "joana@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();*/

        // Puxando Dados
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 3);
        System.out.println(p);
        
        System.out.println("pronto");
        em.close();
        emf.close();
    }
}

