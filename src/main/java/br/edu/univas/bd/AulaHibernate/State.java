package br.edu.univas.bd.AulaHibernate;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ESTADO")
public class State implements Serializable {
	
	@Id
	private int ibge;
	
	@Column(name="SIGLA", nullable=false, length=2)
	private String sigla;
	
	@Column (name="NOME", nullable=false, length=30)
	private String nome;
	
	@Column (name="AREA", nullable=false)
	private float area;
	
	@OneToMany (mappedBy="estado")
	private Set<City> cities;
	
	public Set<City> getCities() {
		return cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}
	
	public State() {
		// TODO Auto-generated constructor stub
	}

	public int getIbge() {
		return ibge;
	}

	public void setIbge(int ibge) {
		this.ibge = ibge;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "State [ibge=" + ibge + ", sigla=" + sigla + ", nome=" + nome + ", area=" + area + "]";
	}
	
}
