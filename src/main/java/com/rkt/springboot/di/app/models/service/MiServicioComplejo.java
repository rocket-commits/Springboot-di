package com.rkt.springboot.di.app.models.service;

//la diferencia es conceptual entre component y service
//import org.springframework.stereotype.Component;
/*Tambien se puede usar Service para aportar una semantica descriptiva, 
es una clase de lógica de negocio*/
//import org.springframework.stereotype.Service;

//@Component("miServicioComplejo")
//Implementa esta interfaz por defecto con la notación primary
//@Primary
public class MiServicioComplejo implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando un proceso importante y complicado...";
	}
	
	
}
