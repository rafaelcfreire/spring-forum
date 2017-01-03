package br.com.ehnois.springforum.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.ehnois.springforum.dao.DAOUsuario;
import br.com.ehnois.springforum.entidades.Usuario;

@Controller
public class AutenticacaoController {

    @Autowired
    private DAOUsuario daoUsuario;
    
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login (@RequestParam("login") String login, @RequestParam("senha") String senha, HttpSession sessao) {
		Usuario usuario = daoUsuario.getUsuario(login);
		if (usuario == null) {
		  return "redirect:loginFalho";
		} else {
    		daoUsuario.persistir(usuario);
    		sessao.setAttribute("usuario", usuario);
		}		
	    sessao.setAttribute("usuario", usuario);
		return "redirect:/usuario/autenticado";
	}
	
	@RequestMapping(value="/loginFalho")
	public ModelAndView retornaLoginFalho() {
	  ModelAndView mav = new ModelAndView("loginFalho");
	  return mav;
	}
}
