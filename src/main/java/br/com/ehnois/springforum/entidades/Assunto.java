package br.com.ehnois.springforum.entidades;

import java.io.Serializable;

public class Assunto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 926850753023979898L;

	protected long id;

	private String nome;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
