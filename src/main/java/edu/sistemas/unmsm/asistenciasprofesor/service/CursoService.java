package edu.sistemas.unmsm.asistenciasprofesor.service;

import java.util.List;

import edu.sistemas.unmsm.asistenciasprofesor.entity.Curso;
import edu.sistemas.unmsm.asistenciasprofesor.model.CursoModel;

public interface CursoService {

	public abstract CursoModel addCurso(CursoModel cursoModel);
	
	public abstract Curso findCursoById(String id);
	
	public abstract CursoModel findCursoByIdModel(String id);
	
	public abstract List<CursoModel> listAllCursos();
	
	public abstract List<CursoModel> listCursosByProfesor(String id);
	
	public abstract boolean removeCurso (String id);
	
}
