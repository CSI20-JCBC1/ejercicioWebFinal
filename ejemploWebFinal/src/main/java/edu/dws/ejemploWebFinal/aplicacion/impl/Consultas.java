package edu.dws.ejemploWebFinal.aplicacion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.dws.ejemploWebFinal.aplicacion.dal.Alumno;
import edu.dws.ejemploWebFinal.aplicacion.dal.AlumnoServicio;


@Service
public class Consultas {
	
	@Autowired
	private AlumnoServicio alu;
	
	@Transactional
	public void insertarUnAlumno(Alumno alumno) {
		alu.save(alumno);
	}
}
