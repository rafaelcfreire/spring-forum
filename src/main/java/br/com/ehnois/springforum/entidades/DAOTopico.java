package br.com.ehnois.springforum.dao;

import java.util.List;

import br.com.ehnois.springforum.entidades.Assunto;
import br.com.ehnois.springforum.entidades.Topico;
import br.com.ehnois.springforum.entidades.Usuario;

public interface DAOTopico extends DAOBase<Topico> {

	public List<Topico> getTopicosPorAutor(Usuario usuario);

	public List<Topico> getTopicosPorAssunto(Assunto assunto, int offset, int max);
}
