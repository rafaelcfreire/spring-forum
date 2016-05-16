package br.com.ehnois.springforum.dao.mocks;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.ehnois.springforum.dao.DAOUsuario;
import br.com.ehnois.springforum.entidades.Usuario;

@Component("br.com.ehnois.springforum.dao.DAOUsuario")
public class MockDAOUsuario extends MockDAOBase<Usuario> implements DAOUsuario {

	public List<Usuario> list(int offset, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario getUsuario(String login) {
		Usuario usuario = new Usuario();
		usuario.setNome("Rafael");
		usuario.setEmail("rafaelcfreire@gmail.com");
		usuario.setLogin("rafaelcfreire");
		usuario.setSenha("12345");

		return usuario;
	}

	@Override
	public Class getClazz() {
		return Usuario.class;
	}

}
