package br.com.ehnois.springforum.dao.mocks;

import java.util.ArrayList;
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

	private String[] titulos = {"Como eu configuro o Spring?", 
			"Problema com suporte a DAO", 
			"Como funciona AOP?", 
			"Duvida com Spring Security",
			"JDBCTemplate: como eu uso?", 
			"Configuracao XML: problema", 
			"Projeto de exemplo", 
			"Hibernate: como definir o SessionFactory?", 
			"DataSource: como obter via JNDI?", 
			"Como funciona a requisicao no MVC?", 
			"Aonde uso o Spring?"};

	public List<Topico> list(int offset, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Topico> getTopicosPorAutor(Usuario usuario) {
		List<Topico> resultado = new ArrayList<Topico>();
		if (usuario != null) {
			int num_registros = (int) (Math.random() * titulos.length);
			for (int i = 0; i < num_registros; i++) {
				Topico topico = new Topico();
				topico.setTitulo(titulos[i]);
				resultado.add(topico);
			}			
		}
		return resultado;
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
