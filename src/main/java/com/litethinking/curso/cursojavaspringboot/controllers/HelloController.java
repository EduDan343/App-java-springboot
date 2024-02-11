package com.litethinking.curso.cursojavaspringboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping(value = "/")
	public String saludo() {
		String saludo = "<h1>Hola mi nombre es Eduardo, saludo generado utilizando springboot</h1>";
		return saludo;
	}
}
