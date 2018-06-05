package edu.sistemas.unmsm.asistenciasprofesor.converter.impl;

import org.springframework.stereotype.Component;

import edu.sistemas.unmsm.asistenciasprofesor.converter.Converter;
import edu.sistemas.unmsm.asistenciasprofesor.entity.Alumno;
import edu.sistemas.unmsm.asistenciasprofesor.model.AlumnoModel;

@Component("alumnoConverter")
public class AlumnoConverter extends Converter<Alumno, AlumnoModel>{

	@Override
	public Alumno modelToEntity(AlumnoModel m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AlumnoModel entityToModel(Alumno e) {
		// TODO Auto-generated method stub
		return null;
	}

}
