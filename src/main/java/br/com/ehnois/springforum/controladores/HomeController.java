package br.com.ehnois.springforum.controladores;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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

	@RequestMapping(value = "/executarRegistro", method = RequestMethod.POST)
	public String executarRegistro(@Valid Usuario usuario, BindingResult bindingResult, HttpSession sessao,
			@RequestParam(value = "avatar", required = false) MultipartFile avatar) {

		if (bindingResult.hasErrors()) {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("usuario", usuario);
			return registro(model);
		}

		// getDaoUsuario().persistir(usuario);

		if (! avatar.isEmpty()) {
			processarAvatar(usuario, avatar);
		}		
		sessao.setAttribute("usuario", usuario);
		return "redirect:/";
	}
	
	private void processarAvatar(Usuario usuario, MultipartFile avatar) {
		File diretorio = new File("/springForum/avatares");
		if (! diretorio.exists()) {
			diretorio.mkdirs();
		}
		try {
			FileOutputStream arquivo = new FileOutputStream(diretorio.getAbsolutePath() + "/" + usuario.getLogin() + ".png");
			arquivo.write(avatar.getBytes());
			arquivo.close();
		} catch (IOException ex) {
			
		}
	}	
}
