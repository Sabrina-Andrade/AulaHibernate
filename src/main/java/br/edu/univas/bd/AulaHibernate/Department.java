package br.edu.univas.bd.AulaHibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name="DEPARTAMENTO")
public class Department implements Serializable {
	
	@Id
	@GeneratedValue (strategy= GenerationType.SEQUENCE,
					generator=" codigo_gen ")

	@SequenceGenerator (name=" codigo_gen ",
						sequenceName=" SEQ_DEPARTAMENTO ",
						allocationSize=1)
	private int codigo;
	
	@Column (name="NOME", nullable=false, length=20)
	private String nome;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
