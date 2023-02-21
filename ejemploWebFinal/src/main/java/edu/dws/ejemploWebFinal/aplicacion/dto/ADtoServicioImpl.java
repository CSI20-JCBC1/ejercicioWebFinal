package edu.dws.ejemploWebFinal.aplicacion.dto;


public class ADtoServicioImpl implements ADtoServicio {

	@Override
	public AlumnoDTO AAlumnosDTO(String nombre, String apellidos) {
		AlumnoDTO DTO = new AlumnoDTO(nombre,apellidos);
		return DTO;
	}
}
