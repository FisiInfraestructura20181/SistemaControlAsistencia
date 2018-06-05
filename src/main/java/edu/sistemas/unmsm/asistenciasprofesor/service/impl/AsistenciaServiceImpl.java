package edu.sistemas.unmsm.asistenciasprofesor.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import edu.sistemas.unmsm.asistenciasprofesor.converter.impl.AsistenciaConverter;
import edu.sistemas.unmsm.asistenciasprofesor.entity.Asistencia;
import edu.sistemas.unmsm.asistenciasprofesor.model.AsistenciaModel;
import edu.sistemas.unmsm.asistenciasprofesor.repository.AsistenciaRepository;
import edu.sistemas.unmsm.asistenciasprofesor.service.AsistenciaService;

@Service("asistenciaService")
public class AsistenciaServiceImpl implements AsistenciaService{

	@Autowired
	@Qualifier("asistenciaRepository")
	private AsistenciaRepository asistenciaRepository;
	
	@Autowired
	@Qualifier("asistenciaConverter")
	private AsistenciaConverter asistenciaConverter;
	
	@Override
	public List<AsistenciaModel> listAllAsistencias() {
		List<Asistencia> asistencias = asistenciaRepository.findAll();
		List<AsistenciaModel> asistenciasModel = new ArrayList<>();
		asistencias.forEach(asistencia -> {
			asistenciasModel.add(asistenciaConverter.entityToModel(asistencia));
		});
		return asistenciasModel;
	}

	@Override
	public List<AsistenciaModel> listAsistenciasByCurso(String id) {
		List<Asistencia> asistencias = asistenciaRepository.findAllByIdCurso(id);
		List<AsistenciaModel> asistenciasModel = new ArrayList<>();
		asistencias.forEach(asistencia -> {
			asistenciasModel.add(asistenciaConverter.entityToModel(asistencia));
		});
		return asistenciasModel;
	}

	@Override
	public List<AsistenciaModel> listAsistenciasBySesion(String id) {
		List<Asistencia> asistencias = asistenciaRepository.findAllByIdSesion(id);
		List<AsistenciaModel> asistenciasModel = new ArrayList<>();
		asistencias.forEach(asistencia -> {
			asistenciasModel.add(asistenciaConverter.entityToModel(asistencia));
		});
		return asistenciasModel;
	}

	@Override
	public List<AsistenciaModel> listAsistenciasBySesionAlumno(String id, String codigo) {
		List<Asistencia> asistencias = asistenciaRepository.findAllByIdCursoCodigo(id, codigo);
		List<AsistenciaModel> asistenciasModel = new ArrayList<>();
		asistencias.forEach(asistencia -> {
			asistenciasModel.add(asistenciaConverter.entityToModel(asistencia));
		});
		return asistenciasModel;
	}

}
