package com.rkt.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rkt.springboot.di.app.models.service.IServicio;

//import com.rkt.springboot.di.app.models.service.MiServicio;

@Controller
public class IndexController {

	// private MiServicio servicio = new MiServicio();
	
	@Autowired
	//@Qualifier("miServicioPrincipal")
	private IServicio servicio;

	@GetMapping({ "/index", "/", "" })
	public String index(Model model) {

		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}
	/*
	 * //Generando el Setter desde source y borrando super();
	 * 
	 * @Autowired public void setServicio(IServicio servicio) { this.servicio =
	 * servicio; }
	 */

	/*
	 * //Generando el constructor usando campos desde source
	 * 
	 * @Autowired public IndexController(IServicio servicio) { this.servicio =
	 * servicio; }
	 */

}
