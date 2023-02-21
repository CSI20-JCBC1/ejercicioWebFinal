package edu.dws.ejemploWebFinal.aplicacion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.dws.ejemploWebFinal.aplicacion.dal.Alumno;
import edu.dws.ejemploWebFinal.aplicacion.dal.AlumnoServicio;

@Service(value="Consultas")
public class Consultas {
	
	@Autowired
	private AlumnoServicio alumnoIn;
	
	@Transactional
	public void insertarUnAlumno(Alumno alumno) {
		alumnoIn.save(alumno);
	}
}
