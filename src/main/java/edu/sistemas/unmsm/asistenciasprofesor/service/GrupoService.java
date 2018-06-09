package edu.sistemas.unmsm.asistenciasprofesor.service;

import java.util.List;

import edu.sistemas.unmsm.asistenciasprofesor.model.GrupoModel;

public interface GrupoService {

	public abstract GrupoModel addGrupo(GrupoModel grupoModel);
	
	public abstract List<GrupoModel> listAllGrupos();
	
	public abstract List<GrupoModel> listAllGruposByProfesor(String id);
	
	public abstract List<GrupoModel> listAllGruposByCurso(String id);
	
}
