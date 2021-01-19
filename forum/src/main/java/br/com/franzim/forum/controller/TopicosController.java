package br.com.franzim.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<Topico> lista( ) {
		
		Curso curso = new Curso("Spring","Programação");
		
			Topico topico = new Topico("Dúvida", "Contratação", curso);
			Topico topico2 = new Topico("Dúvida 2", "Dúvida no Spring", curso);
			Topico topico3 = new Topico("Dúvida 3", "Dúvida no Spring", curso);
			return Arrays.asList(topico, topico2, topico3);
	}
}
