package edu.sistemas.unmsm.asistenciasprofesor.service;

import java.util.List;

import edu.sistemas.unmsm.asistenciasprofesor.model.AsistenciaModel;

public interface AsistenciaService {

	public abstract List<AsistenciaModel> listAllAsistencias();
	
	public abstract List<AsistenciaModel> listAsistenciasByCurso(String id);
	
	public abstract List<AsistenciaModel> listAsistenciasBySesion(String id);
	
	public abstract List<AsistenciaModel> listAsistenciasBySesionAlumno(String id, String codigo);
	
}
