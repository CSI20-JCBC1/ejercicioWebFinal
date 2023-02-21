package edu.dws.ejemploWebFinal.web.controladores;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.dws.ejemploWebFinal.aplicacion.AplicacionConfiguracionContexto;
import edu.dws.ejemploWebFinal.aplicacion.dal.Alumno;
import edu.dws.ejemploWebFinal.aplicacion.impl.Consultas;




@Controller
public class ControladorSegunda {
	
	@Autowired
	 Consultas consulta=new Consultas();
	
	 protected final Log logger = LogFactory.getLog(getClass());
	    
	    List<Alumno> alumnos = new ArrayList<Alumno>();
	    Map<String, Object> miModelo = new HashMap<String, Object>();  
	    
	    @RequestMapping(value="/segunda")
	    public ModelAndView gestionSolicitud() {
	        logger.info("Navegamos a la vista segunda");     
	        
	        
	        
	               
	        
	        miModelo.put("listaAlumnos", alumnos);
	        return new ModelAndView("segunda", "miModelo", miModelo);
	    }
	    
	    @RequestMapping(value="/navegacionFormulario")
	    public String navegacionFormulario(Model modelo) {
	        logger.info("Navegamos al formulario");
	        Alumno alumno = new Alumno();
	        modelo.addAttribute("alumnoV", alumno);
	        return "formulario";
	    } 
	    
	    
	    @RequestMapping(value="/guardarAlumno",method = RequestMethod.POST)
	    public ModelAndView guardarAlumno(@ModelAttribute("alumnoV") Alumno alumnoV){
	    	logger.info("Navegamos al guardar alumno");
	    	alumnos.add(alumnoV);  
	        miModelo.put("mensaje","Todo ok");
	        miModelo.put("listaAlumnos", alumnos);
	        
	    consulta.insertarUnAlumno(alumnoV);
	        
	    	return new ModelAndView("segunda", "miModelo", miModelo);
	    }
	        
	    } 