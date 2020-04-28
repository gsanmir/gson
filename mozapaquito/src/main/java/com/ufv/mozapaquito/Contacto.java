package com.ufv.mozapaquito;

public class Contacto {
	private String id;
	private String nombre;
	private String apellidos;
	private String empresa;
	private String telefono;
	private String email;
	private String direccion;
	public Contacto(String nombre) {
		this.setNombre(nombre);
		// TODO Auto-generated constructor stub
	}
	public Contacto(String nombre, String apellidos, String empresa, String telefono, String email, String direccion) {
		super();
		this.setNombre(nombre);	
		this.setApellidos(apellidos);
		this.setEmpresa(empresa);
		this.setTelefono(telefono);
		this.setEmail(email);
		this.setDireccion(direccion);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
