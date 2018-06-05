package edu.sistemas.unmsm.asistenciasprofesor.converter.impl;

import org.springframework.stereotype.Component;

import edu.sistemas.unmsm.asistenciasprofesor.converter.Converter;
import edu.sistemas.unmsm.asistenciasprofesor.entity.Sesion;
import edu.sistemas.unmsm.asistenciasprofesor.model.SesionModel;

@Component("sesionConverter")
public class SesionConverter extends Converter<Sesion, SesionModel> {

	@Override
	public Sesion modelToEntity(SesionModel m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SesionModel entityToModel(Sesion e) {
		// TODO Auto-generated method stub
		return null;
	}

}
