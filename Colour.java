package com.problem.gold1.ruby1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Colour {
	@GetMapping("Colour")
	public String getFav() {
		String s="Purple";
		return "My favourite colour is "+s;
	}

}
