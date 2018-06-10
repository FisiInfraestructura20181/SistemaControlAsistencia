package edu.sistemas.unmsm.asistenciasprofesor.converter.impl;

import org.springframework.stereotype.Component;

import edu.sistemas.unmsm.asistenciasprofesor.converter.AbstractConverter;
import edu.sistemas.unmsm.asistenciasprofesor.entity.Profesor;
import edu.sistemas.unmsm.asistenciasprofesor.model.ProfesorModel;

@Component("profesorConverter")
public class ProfesorConverter extends AbstractConverter<Profesor, ProfesorModel>{

	@Override
	public Profesor modelToEntity(ProfesorModel m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProfesorModel entityToModel(Profesor e) {
		
		return null;
	}

}
