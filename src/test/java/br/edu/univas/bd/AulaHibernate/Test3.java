package br.edu.univas.bd.AulaHibernate;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.univas.bd.util.HibernateUtil;

public class Test3 {
	
	@Test
	public void test3 () {
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		
		State estados = em.find(State.class, 123456);		
		System.out.println("O estado procurado é: " + estados.getNome());
		
		City cidadeCachoeira = new City();
		City cidadePouso = new City();
		
		cidadeCachoeira.setIbge(101112);
		cidadeCachoeira.setNome("Cachoeira de Minas");
		cidadeCachoeira.setArea(7777);
		cidadeCachoeira.setEstado(estados);
		
		cidadePouso.setIbge(202122);
		cidadePouso.setNome("Pouso Alegre");
		cidadePouso.setArea(6666);
		cidadePouso.setEstado(estados);
		
		em.getTransaction().begin();
		em.persist(cidadeCachoeira);
		em.persist(cidadePouso);
		em.getTransaction().commit();
	
	}

}
