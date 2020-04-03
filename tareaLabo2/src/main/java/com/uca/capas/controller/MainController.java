package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.User;

@Controller
public class MainController {

	@GetMapping("/Login")
	public String sendForm(User user) {
		return "Login";
	}
//Credenciales Correctas: User:Marvin Password:1234
	@PostMapping(path="/Validacion")
	public String processingForm(User user) {
		if(user.getUser().equals("Marvin") && user.getPassword().equals("1234")) {
			return "MostrarMensajeV";
		}else {
			return "MostrarMensajeF";
		}
	}
}
