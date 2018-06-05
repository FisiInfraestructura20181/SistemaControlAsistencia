package edu.sistemas.unmsm.asistenciasprofesor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import edu.sistemas.unmsm.asistenciasprofesor.converter.impl.ProfesorConverter;
import edu.sistemas.unmsm.asistenciasprofesor.entity.Profesor;
import edu.sistemas.unmsm.asistenciasprofesor.model.ProfesorModel;
import edu.sistemas.unmsm.asistenciasprofesor.repository.ProfesorRepository;
import edu.sistemas.unmsm.asistenciasprofesor.service.ProfesorService;

@Service("profesorService")
public class ProfesorServiceImpl implements ProfesorService{

	@Autowired
	@Qualifier("profesorRepository")
	private ProfesorRepository profesorRepository;
	
	@Autowired
	@Qualifier("profesorConverter")
	private ProfesorConverter profesorConverter;
	
	@Override
	public Profesor findProfesorById(String id) {
		return profesorRepository.getOne(id);
	}

	@Override
	public ProfesorModel findProfesorByIdModel(String id) {
		return profesorConverter.entityToModel(findProfesorById(id));
	}
	
	@Override
	public ProfesorModel editProfesor(ProfesorModel profesorModel) {
		Profesor profesor = profesorRepository.save(profesorConverter.modelToEntity(profesorModel));
		return profesorConverter.entityToModel(profesor);
	}

}
