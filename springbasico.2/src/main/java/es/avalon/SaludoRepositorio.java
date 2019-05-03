package es.avalon;

import org.springframework.stereotype.Component;

@Component
public class SaludoRepositorio {
	
	public String saludar() {
		return "hola desde";
	}

}
