package edu.sistemas.unmsm.asistenciasprofesor.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.sistemas.unmsm.asistenciasprofesor.converter.impl.AlumnoConverter;
import edu.sistemas.unmsm.asistenciasprofesor.entity.Alumno;
import edu.sistemas.unmsm.asistenciasprofesor.model.AlumnoModel;
import edu.sistemas.unmsm.asistenciasprofesor.repository.AlumnoRepository;
import edu.sistemas.unmsm.asistenciasprofesor.service.AlumnoService;

@Service("alumnoService")
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	@Qualifier("alumnoRepository")
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	@Qualifier("alumnoConverter")
	private AlumnoConverter alumnoConverter;
	
	@Override
	public List<AlumnoModel> listAllAlumnos() {
		List<Alumno> alumnos = alumnoRepository.findAll();
		List<AlumnoModel> alumnosModel = new ArrayList<>();
		alumnos.forEach(alumno -> {
			alumnosModel.add(alumnoConverter.entityToModel(alumno));
		});
		return alumnosModel;
	}

	@Override
	public Alumno findAlumnoById(String id) {
		return alumnoRepository.getOne(id);
	}

	@Override
	public AlumnoModel findAlumnoByIdModel(String id) {
		return alumnoConverter.entityToModel(findAlumnoById(id));
	}

}
