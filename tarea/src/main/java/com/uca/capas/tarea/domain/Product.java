package com.uca.capas.tarea.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {

	   @Size(min=12, max=12, message = "El campo Código de producto debe tener exactamente 12 digitos")
		private String code;
		
	   @Size(min=1, max=100, message = "El campo Nombre de producto debe tener mínimo 1 y máximo de 100 caracteres")
	    private String name;
	   
	   @Size(min=1, max=100, message = "El campo Marca debe tener mínimo 1 y máximo de 100 caracteres")
	    private String brand;
		
	    @Size(min=1, max=500, message = "El campo Descripción debe tener mínimo 1 y máximo de 500 caracteres")
	    private String desc;
		
	    @Digits(integer=9, fraction=0, message = "EL campo Existencias debe tener sólo números enteros")
	    private String stock;
		
	    @Pattern(regexp="^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$", message = "EL campo Fecha de ingreso debe tener formato día/mes/año (dd/mm/yyyy)")
	    private String datein;
	   
		public Product(){
			
		}
		
		public Product(String code, String name, String brand, String desc, String stock, String datein) {
			super();
			this.code = code;
			this.name = name;
			this.brand = brand;
			this.desc = desc;
			this.stock = stock;
			this.datein = datein;
		}
		

		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getStock() {
			return stock;
		}
		public void setStock(String stock) {
			this.stock = stock;
		}
		public String getDatein() {
			return datein;
		}
		public void setDatein(String datein) {
			this.datein = datein;
		}
		
		
	}
