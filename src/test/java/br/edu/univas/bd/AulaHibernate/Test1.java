package br.edu.univas.bd.AulaHibernate;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.univas.bd.util.HibernateUtil;

public class Test1 {

	@Test
	public void test1() {
		
		State estado = new State();
		estado.setSigla("RJ");
		estado.setNome("Rio de Janeiro");
		estado.setIbge(123654);
		estado.setArea(7777);
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(estado);
		em.getTransaction().commit();
		
		System.out.println("Nome: " + estado.getNome());
	}
}
