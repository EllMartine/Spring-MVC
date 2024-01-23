package com.gbotelho.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CidadesController {
	
	@RequestMapping(value = "/cidades/novo")
	public String novo() {
		return "cidade/CadastroCidade";
	}

}
