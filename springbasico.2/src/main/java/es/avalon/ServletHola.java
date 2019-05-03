package es.avalon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.avalon.configuracion.ConfiguracionSpring;


public class ServletHola extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext();
		
		contexto.register(ConfiguracionSpring.class);
		contexto.refresh();
		
		//Persona p=(Persona) contexto.getBean(Persona.class);
		//IServicioMensaje servicio= contexto.getBean(IServicioMensaje.class);
		//SaludoRepositorio saludorepo=contexto.getBean(SaludoRepositorio.class);
		//SpringVersionRepositorio svrepo=contexto.getBean(SpringVersionRepositorio.class);
		ServicioFachada f=contexto.getBean(ServicioFachada.class);
		
		PrintWriter pw= response.getWriter();
		
		//pw.println(p.getNombre());
		//pw.println(servicio.getIServicio());
		//pw.println(saludorepo.saludar()+svrepo.version());
		pw.println(f.mensaje());
	}

}
