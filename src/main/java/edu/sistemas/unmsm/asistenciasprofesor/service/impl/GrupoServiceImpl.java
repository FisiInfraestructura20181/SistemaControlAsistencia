package edu.sistemas.unmsm.asistenciasprofesor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.sistemas.unmsm.asistenciasprofesor.converter.impl.GrupoConverter;
import edu.sistemas.unmsm.asistenciasprofesor.model.GrupoModel;
import edu.sistemas.unmsm.asistenciasprofesor.repository.GrupoRepository;
import edu.sistemas.unmsm.asistenciasprofesor.service.GrupoService;

@Service("grupoService")
public class GrupoServiceImpl implements GrupoService {

	@Autowired
	@Qualifier("grupoRepository")
	private GrupoRepository grupoRepository;
	
	@Autowired
	@Qualifier("grupoConverter")
	private GrupoConverter grupoConverter;
	
	@Override
	public GrupoModel addGrupo(GrupoModel grupoModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GrupoModel> listAllGrupos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GrupoModel> listAllGruposByProfesor(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GrupoModel> listAllGruposByCurso(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
