package br.com.ehnois.springforum.dao;

import br.com.ehnois.springforum.entidades.Usuario;

public interface DAOUsuario extends DAOBase<Usuario>{

	public Usuario getUsuario(String email);

}
