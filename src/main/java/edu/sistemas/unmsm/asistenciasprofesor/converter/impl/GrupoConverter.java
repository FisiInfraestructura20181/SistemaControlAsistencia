package edu.sistemas.unmsm.asistenciasprofesor.converter.impl;

import org.springframework.stereotype.Component;

import edu.sistemas.unmsm.asistenciasprofesor.converter.AbstractConverter;
import edu.sistemas.unmsm.asistenciasprofesor.entity.Grupo;
import edu.sistemas.unmsm.asistenciasprofesor.model.GrupoModel;

@Component("grupoConverter")
public class GrupoConverter extends AbstractConverter<Grupo, GrupoModel> {

	@Override
	public Grupo modelToEntity(GrupoModel m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GrupoModel entityToModel(Grupo e) {
		// TODO Auto-generated method stub
		return null;
	}

}
