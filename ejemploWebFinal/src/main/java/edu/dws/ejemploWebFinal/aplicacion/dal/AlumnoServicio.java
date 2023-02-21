package edu.dws.ejemploWebFinal.aplicacion.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository(value="AlumnoServicio")
public interface AlumnoServicio extends CrudRepository<Alumno, Integer>{

	
}
