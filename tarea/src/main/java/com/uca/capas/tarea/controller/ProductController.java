package com.uca.capas.tarea.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.uca.capas.tarea.domain.Product;


@Controller
public class ProductController {
		@RequestMapping("/producto")
		public ModelAndView producto() {
			ModelAndView  mav= new ModelAndView();
			mav.addObject("product", new Product());
			mav.setViewName("producto");
			return mav;
		}

		@RequestMapping("/formulario")
		public ModelAndView formulario(@Valid @ModelAttribute Product product, BindingResult result) {
			ModelAndView mav = new ModelAndView();
			
			if(result.hasErrors()) {//hay errores
				mav.setViewName("producto");
			}
			else { //no hay errores
				String saved = "Producto " + product.getName() +" guardado con éxito.";
				mav.addObject("psaved", saved);
				mav.setViewName("result");
				
			}
			
			return mav;
		}


}
