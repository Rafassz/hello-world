package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	@GetMapping ("/listaBSM")
	public String listaBSM() {
		return  "Proatividade   Trabalho em equipe   Comunicação    Mentalidade de crescimento "
				+ "Orientação ao futuro    Responsabilidade pessoal    Persistência    Orientação ao detalhe";
	}
	@GetMapping ("/listaObjetivos")
	public String listaObjetivos() {
		return "Melhorar o conhecimento sobre Spring Entender sobre RestController Melhorar as boas práticas";
	}
}