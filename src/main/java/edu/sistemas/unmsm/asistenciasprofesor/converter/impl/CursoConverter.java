package edu.sistemas.unmsm.asistenciasprofesor.converter.impl;

import org.springframework.stereotype.Component;

import edu.sistemas.unmsm.asistenciasprofesor.converter.AbstractConverter;
import edu.sistemas.unmsm.asistenciasprofesor.entity.Curso;
import edu.sistemas.unmsm.asistenciasprofesor.model.CursoModel;

@Component("cursoConverter")
public class CursoConverter extends AbstractConverter<Curso, CursoModel>{

	@Override
	public Curso modelToEntity(CursoModel m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CursoModel entityToModel(Curso e) {
		// TODO Auto-generated method stub
		return null;
	}

}
