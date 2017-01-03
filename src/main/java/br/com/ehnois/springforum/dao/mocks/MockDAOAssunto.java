package br.com.ehnois.springforum.dao.mocks;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.ehnois.springforum.dao.DAOAssunto;
import br.com.ehnois.springforum.entidades.Assunto;

@Component("daoAssunto")
public class MockDAOAssunto extends MockDAOBase<Assunto> implements DAOAssunto {

	private List<Assunto> todos;
	
	public List<Assunto> list() {
		if (todos == null) {
			todos = new ArrayList<Assunto>();
			String[] assuntos = {"Container IoC", "AOP", "Spring MVC", "ORM", "Spring Batch", "Spring WebFlow"};
			for (int i = 0; i < assuntos.length; i++) {
				Assunto assunto = new Assunto();
				assunto.setNome(assuntos[i]);
				assunto.setId(i + 1);
				todos.add(assunto);
			}
			java.util.Collections.sort(todos);
		}
		return todos;
	}

	public void persistir(Assunto objeto) {
		// TODO Auto-generated method stub

	}

	public void excluir(Assunto objeto) {
		// TODO Auto-generated method stub

	}

	public Assunto get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class getClazz() {
		// TODO Auto-generated method stub
		return null;
	}

}
