package com.gbotelho.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EstilosController {
	
	@RequestMapping(value = "/estilos/novo")
	public String novo() {
		return "estilo/CadastroEstilo";
	}

}
