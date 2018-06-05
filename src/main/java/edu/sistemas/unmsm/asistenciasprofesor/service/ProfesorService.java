package edu.sistemas.unmsm.asistenciasprofesor.service;

import edu.sistemas.unmsm.asistenciasprofesor.entity.Profesor;
import edu.sistemas.unmsm.asistenciasprofesor.model.ProfesorModel;

public interface ProfesorService {

	public abstract Profesor findProfesorById (String id);
	
	public abstract ProfesorModel findProfesorByIdModel (String id);
	
	public abstract ProfesorModel editProfesor(ProfesorModel profesorModel);
	
}
