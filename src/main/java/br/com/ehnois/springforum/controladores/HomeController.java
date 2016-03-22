package br.com.ehnois.springforum.controladores;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Autowired
	private DAOUsuario daoUsuario;

	@Autowired
	private DAOAssunto daoAssunto;

	@RequestMapping("/")
	public String index(Map<String, Object> model) {
		//model.put("assuntos", getDaoAssunto().list());
		//model.put("usuarios", getDaoUsuario().list());
		return "index";
	}

	public DAOUsuario getDaoUsuario() {
		return daoUsuario;
	}

	public void setDaoUsuario(DAOUsuario daoUsuario) {
		this.daoUsuario = daoUsuario;
	}

	public DAOAssunto getDaoAssunto() {
		return daoAssunto;
	}

	public void setDaoAssunto(DAOAssunto daoAssunto) {
		this.daoAssunto = daoAssunto;
	}
}
