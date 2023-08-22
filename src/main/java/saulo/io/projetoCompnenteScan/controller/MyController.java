package saulo.io.projetoCompnenteScan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String hello() {
		
		System.out.println("Olá");
		
		return "hello";
	}
}
