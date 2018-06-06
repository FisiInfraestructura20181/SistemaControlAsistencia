package edu.sistemas.unmsm.asistenciasprofesor.converter.impl;

import org.springframework.stereotype.Component;

import edu.sistemas.unmsm.asistenciasprofesor.converter.AbstractConverter;
import edu.sistemas.unmsm.asistenciasprofesor.entity.Asistencia;
import edu.sistemas.unmsm.asistenciasprofesor.model.AsistenciaModel;

@Component("asistenciaConverter")
public class AsistenciaConverter extends AbstractConverter<Asistencia, AsistenciaModel>{

	@Override
	public Asistencia modelToEntity(AsistenciaModel m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AsistenciaModel entityToModel(Asistencia e) {
		// TODO Auto-generated method stub
		return null;
	}

}
