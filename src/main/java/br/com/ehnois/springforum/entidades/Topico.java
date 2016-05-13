package br.com.ehnois.springforum.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity @Table(name="topico")
public class Topico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3714392743066723650L;

	protected long id;
	
	private Assunto assunto;
	
	private Usuario autor;
	
	private Date dataCadastro = new Date();
	
	private String titulo;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Assunto getAssunto() {
		return assunto;
	}
	
	public void setAssunto(Assunto assunto) {
		this.assunto = assunto;
	}
	
	public Usuario getAutor() {
		return autor;
	}
	
	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
