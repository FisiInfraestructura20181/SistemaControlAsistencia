package edu.sistemas.unmsm.asistenciasprofesor.service;

import java.util.List;

import edu.sistemas.unmsm.asistenciasprofesor.entity.Alumno;
import edu.sistemas.unmsm.asistenciasprofesor.model.AlumnoModel;

public interface AlumnoService {

	public abstract List<AlumnoModel> listAllAlumnos();
	
	public abstract Alumno findAlumnoById (String id);
	
	public abstract AlumnoModel findAlumnoByIdModel(String id);
	
}
