package br.com.ehnois.springforum.controladores;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ehnois.springforum.entidades.Usuario;

@Controller
public class HomeController {
	
	@RequestMapping("/registro")
	public String registro(Map<String, Object> model) {
		if (model.get("usuario") == null) {
			model.put("usuario", new Usuario());
		}
		return "registro";
	}
	
	@RequestMapping(value="/executarRegistro", method=RequestMethod.POST)
	public String executarRegistro(Usuario usuario, HttpSession sessao) {
		//getDaoUsuario().persistir(usuario);
		sessao.setAttribute("usuario", usuario);
		return "redirect:/";
	}	
}
