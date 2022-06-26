package com.rkt.springboot.di.app.models.service;

/*Primay indica el servicio por defecto a ser cargado por Autowired
desde el controlador*/
//import org.springframework.context.annotation.Primary;
//la diferencia es conceptual entre component y service
//import org.springframework.stereotype.Component;
/*Tambien se puede usar Service para aportar una semantica descriptiva, 
es una clase de lógica de negocio*/
//import org.springframework.stereotype.Service;


/*@Primary
@Component("miServicioPrincipal")
*/
public class MiServicio implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando un proceso importante y simple...";
	}
	
	
}
