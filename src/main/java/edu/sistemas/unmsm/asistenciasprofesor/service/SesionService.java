package edu.sistemas.unmsm.asistenciasprofesor.service;

import java.util.List;

import edu.sistemas.unmsm.asistenciasprofesor.entity.Sesion;
import edu.sistemas.unmsm.asistenciasprofesor.model.SesionModel;

public interface SesionService {

	public abstract SesionModel addSesion (SesionModel sesionModel);
	
	public abstract List<SesionModel> listAllSesiones();
	
	public abstract List<SesionModel> listSesionesByCurso(String id);
	
	public abstract Sesion findSesionById (String id);
	
	public abstract SesionModel findSesionByIdModel (String id);
	
}
