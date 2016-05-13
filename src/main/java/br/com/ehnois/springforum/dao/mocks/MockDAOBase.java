package br.com.ehnois.springforum.dao.mocks;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class MockDAOBase<T> {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public abstract Class getClazz();

	public Session getSession() {
		return getSessionFactory().getCurrentSession();
	}

	public T get(Long id) {
		return (T) getSession().get(getClazz(), id);
	}

	public void persistir(T obj) {
		getSession().saveOrUpdate(obj);
	}

	public void excluir(T obj) {
		getSession().delete(obj);
	}
}
