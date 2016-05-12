package br.edu.univas.bd.AulaHibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="CIDADE")
public class City implements Serializable {

	@Id
	private int ibge;
	
	@Column (name="NOME", nullable=false, length=30)
	private String nome;
	
	@Column (name="AREA", nullable=false)
	private float area;
	
	@ManyToOne
	@JoinColumn (name="UF_PK")
	private State estado;
	
	public City() {
		// TODO Auto-generated constructor stub
	}

	public int getIbge() {
		return ibge;
	}

	public void setIbge(int ibge) {
		this.ibge = ibge;
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

	public State getEstado() {
		return estado;
	}

	public void setEstado(State estado) {
		this.estado = estado;
	}
	
}
