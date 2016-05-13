package br.com.ehnois.springforum.dao.mocks;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.com.ehnois.springforum.dao.DAOTopico;
import br.com.ehnois.springforum.entidades.Assunto;
import br.com.ehnois.springforum.entidades.Topico;
import br.com.ehnois.springforum.entidades.Usuario;

@Component("br.com.ehnois.springforum.dao.DAOTopico")
@Repository
public class MockDAOTopico extends MockDAOBase<Topico> implements DAOTopico{

	public List<Topico> list(int offset, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Topico> getTopicosPorAutor(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Topico> getTopicosPorAssunto(Assunto assunto, int offset, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class getClazz() {
		return Topico.class;
	}

}
