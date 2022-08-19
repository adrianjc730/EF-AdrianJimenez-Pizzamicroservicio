package com.idat.EFAdrianJimenezPizzamicroservicio.DTO;

public class Cliente {

	private Integer idCliente;
	private String nombre;
	private String apellido;
	private String nrocelular;
	private String direccion;
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNrocelular() {
		return nrocelular;
	}
	public void setNrocelular(String nrocelular) {
		this.nrocelular = nrocelular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
