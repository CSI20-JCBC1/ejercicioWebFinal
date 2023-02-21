package edu.dws.ejemploWebFinal.aplicacion.dto;

import edu.dws.ejemploWebFinal.aplicacion.dal.Alumno;

public class ADaoServicioImpl implements ADaoServicio {

	@Override
	public Alumno AlumnosDTOADAO(AlumnoDTO alumnosDTO) {
		Alumno alumno = new Alumno();
		if (alumnosDTO != null) {
			alumno.setNombre(alumnosDTO.getNombre());
			alumno.setApellidos(alumnosDTO.getApellidos());

		}
		return alumno;
	}
}