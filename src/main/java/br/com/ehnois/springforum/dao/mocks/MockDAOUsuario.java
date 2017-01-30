package br.com.ehnois.springforum.dao.mocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.ehnois.springforum.dao.DAOUsuario;
import br.com.ehnois.springforum.entity.Usuario;

@Component("br.com.ehnois.springforum.dao.DAOUsuario")
public class MockDAOUsuario extends MockDAOBase<Usuario> implements DAOUsuario {

    private Map<String, Usuario> conjuntoUsuarios = new HashMap<String, Usuario>();
    
    public MockDAOUsuario() {
      Usuario usuario = new Usuario();
      usuario.setNome("Rafael");
      usuario.setEmail("rafaelcfreire@gmail.com");
      usuario.setLogin("rafaelcfreire");
      usuario.setSenha("12345");

      Usuario usuario1 = new Usuario();
      usuario1.setNome("Rafael");
      usuario1.setEmail("rafaelcfreire@gmail.com");
      usuario1.setLogin("rafaelcfreire");
      usuario1.setSenha("12345");

      Usuario usuario2 = new Usuario();
      usuario2.setNome("Rafael");
      usuario2.setEmail("rafaelcfreire@gmail.com");
      usuario2.setLogin("rafaelcfreire");
      usuario2.setSenha("12345");

      conjuntoUsuarios.put(usuario.getEmail(), usuario);
      conjuntoUsuarios.put(usuario.getEmail(), usuario);
      conjuntoUsuarios.put(usuario.getEmail(), usuario);
    }

	public List<Usuario> list() {
		return new ArrayList<Usuario>(conjuntoUsuarios.values());
	}

	public Usuario getUsuario(String email) {
		return conjuntoUsuarios.get(email);
	}

	@Override
	public Class getClazz() {
		return Usuario.class;
	}
}
