package br.edu.univas.bd.AulaHibernate;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.univas.bd.util.HibernateUtil;

public class Test52 {
	
	@Test
	public void test52 () {
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		State estadoMg = em.find(State.class, 123456);
		
		for (City cidade : estadoMg.getCities()) {
			System.out.println("Cidades: " + cidade.getNome());
		}
		
	}

}
