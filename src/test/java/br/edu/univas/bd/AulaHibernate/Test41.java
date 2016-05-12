package br.edu.univas.bd.AulaHibernate;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.univas.bd.util.HibernateUtil;

public class Test41 {
	
	@Test
	public void test41 () {
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		City cidadeVolta = em.find(City.class, 303132);
		City cidadeParaty = em.find(City.class, 404142);
		State estadoRJ = em.find(State.class, 123654);
		
		cidadeVolta.setEstado(estadoRJ);
		cidadeParaty.setEstado(estadoRJ);
		
		em.getTransaction().begin();
		em.merge(cidadeVolta);
		em.merge(cidadeParaty);
		em.getTransaction().commit();
		
	}
}
