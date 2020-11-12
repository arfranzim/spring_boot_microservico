package br.com.franzim.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {

	@RequestMapping("/")
	@ResponseBody
	public String init() {
		return "Response body";
	}
}
