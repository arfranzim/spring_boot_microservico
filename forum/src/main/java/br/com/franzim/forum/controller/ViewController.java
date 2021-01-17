package br.com.franzim.forum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {

	@RequestMapping("/")
	public String init() {
		return "Response body";
	}
}
