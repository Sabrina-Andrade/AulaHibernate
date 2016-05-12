package br.edu.univas.bd.AulaHibernate;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.univas.bd.util.HibernateUtil;

public class Test4 {
	
	@Test
	public void test4 () {
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		State estados = em.find(State.class, 654321);
		
		City cidadeVolta = new City();
		City cidadeParaty = new City();
		
		cidadeVolta.setIbge(303132);
		cidadeVolta.setNome("Volta Redonda");
		cidadeVolta.setArea(5555);
		cidadeVolta.setEstado(estados);
		
		cidadeParaty.setIbge(404142);
		cidadeParaty.setNome("Paraty");
		cidadeParaty.setArea(4444);
		cidadeParaty.setEstado(estados);
		
		em.getTransaction().begin();
		em.persist(cidadeVolta);
		em.persist(cidadeParaty);
		em.getTransaction().commit();
		
	}

}
