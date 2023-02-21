package edu.dws.ejemploWebFinal.aplicacion.dto;

public class AlumnoDTO {
	private Integer id_alumno;

	private String nombre;

	private String apellidos;

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

	public AlumnoDTO() {
		super();
	}

	public AlumnoDTO(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Alumno: " + nombre + " " + apellidos;
	}

}
