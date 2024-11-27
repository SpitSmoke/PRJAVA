package dev.pedrolobo.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dev.pedrolobo.jpademo.domain.Product;

public class JpaDemoApplication {

	public static void main(String[] args) {

  Product product = new Product(null, "CE 580M", "backhoe", "Case", "yellow, 89hp, 4x4");

  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo-PU");
  EntityManager entityManager = entityManagerFactory.createEntityManager();

    entityManager.getTransaction().begin();
    entityManager.persist(product);
    entityManager.getTransaction().commit();

    entityManager.close();  
    entityManagerFactory.close();
	}
}
