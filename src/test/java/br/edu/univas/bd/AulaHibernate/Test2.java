package br.edu.univas.bd.AulaHibernate;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.univas.bd.util.HibernateUtil;

public class Test2 {
	
	@Test
	public void test2 () {
		
		Department dp = new Department();
		
		dp.setNome("Finanças");
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(dp);
		em.getTransaction().commit();
		
		System.out.println("Código: " + dp.getCodigo());
	}

}
