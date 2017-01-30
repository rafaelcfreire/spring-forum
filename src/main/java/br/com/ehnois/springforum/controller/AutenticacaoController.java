package br.com.ehnois.springforum.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.ehnois.springforum.dao.DAOUsuario;
import br.com.ehnois.springforum.entity.Usuario;

@Controller
public class AutenticacaoController {

    @Autowired
    private DAOUsuario daoUsuario;

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login (@RequestParam("email") String email, @RequestParam("senha") String senha, HttpSession sessao) {
		Usuario usuario = daoUsuario.getUsuario(email);
		if (usuario == null) {
		  return "redirect:/loginFalho";
		}
    	sessao.setAttribute("usuario", usuario);
    	return "usuarioAutenticado";
	}
	
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String validateLocale () {
        return "usuarioAutenticado";
    }

	@RequestMapping(value="/loginFalho")
	public ModelAndView retornaLoginFalho() {
	  ModelAndView mav = new ModelAndView("loginFalho");
	  return mav;
	}
}
