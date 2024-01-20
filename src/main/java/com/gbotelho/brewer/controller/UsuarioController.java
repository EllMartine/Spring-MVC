package com.gbotelho.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {
	
	@RequestMapping(value = "/usuarios/novo")
	public String novo() {
		return "usuario/CadastroUsuario";
	}

}
