package br.edu.univas.bd.AulaHibernate;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.univas.bd.util.HibernateUtil;

public class Test51 {
	
	@Test
	public void test51 () {
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		City cidadeVolta = em.find(City.class, 303132);
		System.out.println("Nome: " + cidadeVolta.getNome() + "  Sigla: " + cidadeVolta.getEstado().getSigla());
		City cidadeParaty = em.find(City.class, 404142);
		System.out.println("Nome: " + cidadeParaty.getNome() + "  Sigla: " + cidadeParaty.getEstado().getSigla());
		City cidadeCachoeira = em.find(City.class, 101112);
		System.out.println("Nome: " + cidadeCachoeira.getNome() + " Sigla: " + cidadeCachoeira.getEstado().getSigla());		
	}

}
