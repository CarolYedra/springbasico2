package es.avalon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicioFachada {
	
	@Autowired
	SaludoRepositorio reposaludo;
	@Autowired
	SpringVersionRepositorio repoversion;
	
	
	
	public SaludoRepositorio getReposaludo() {
		return reposaludo;
	}
	public void setReposaludo(SaludoRepositorio reposaludo) {
		this.reposaludo = reposaludo;
	}
	public SpringVersionRepositorio getRepoversion() {
		return repoversion;
	}
	public void setRepoversion(SpringVersionRepositorio repoversion) {
		this.repoversion = repoversion;
	}
	public String mensaje() {
		return reposaludo.saludar()+repoversion.version();
	}
	

}
