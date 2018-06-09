package edu.sistemas.unmsm.asistenciasprofesor.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import edu.sistemas.unmsm.asistenciasprofesor.converter.impl.SesionConverter;
import edu.sistemas.unmsm.asistenciasprofesor.entity.Sesion;
import edu.sistemas.unmsm.asistenciasprofesor.model.SesionModel;
import edu.sistemas.unmsm.asistenciasprofesor.repository.SesionRepository;
import edu.sistemas.unmsm.asistenciasprofesor.service.SesionService;

@Service("sesionService")
public class SesionServiceImpl implements SesionService {

	@Autowired
	@Qualifier("sesionRepository")
	private SesionRepository sesionRepository;
	
	@Autowired
	@Qualifier("sesionConverter")
	private SesionConverter sesionConverter;
	
	@Override
	public SesionModel addSesion(SesionModel sesionModel) {
		Sesion sesion = sesionRepository.save(sesionConverter.modelToEntity(sesionModel));
		return sesionConverter.entityToModel(sesion);		
	}

	@Override
	public List<SesionModel> listAllSesiones() {
		List<Sesion> sesiones = sesionRepository.findAll();
		List<SesionModel> sesionesModel = new ArrayList<>();
		sesiones.forEach(sesion -> {
			sesionesModel.add(sesionConverter.entityToModel(sesion));
		});
		return sesionesModel;
	}

	@Override
	public List<SesionModel> listSesionesByGrupo (int id) {
		return null;
	}


	@Override
	public Sesion findSesionById(String id) {
		return sesionRepository.getOne(id);
	}


	@Override
	public SesionModel findSesionByIdModel(String id) {
		return sesionConverter.entityToModel(findSesionById(id));
	}

}
