package edu.sistemas.unmsm.asistenciasprofesor.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import edu.sistemas.unmsm.asistenciasprofesor.converter.impl.CursoConverter;
import edu.sistemas.unmsm.asistenciasprofesor.entity.Curso;
import edu.sistemas.unmsm.asistenciasprofesor.model.CursoModel;
import edu.sistemas.unmsm.asistenciasprofesor.repository.CursoRepository;
import edu.sistemas.unmsm.asistenciasprofesor.service.CursoService;

@Service("cursoService")
public class CursoServiceImpl implements CursoService {

	@Autowired
	@Qualifier("cursoRepository")
	private CursoRepository cursoRepository;

	@Autowired
	@Qualifier("cursoConverter")
	private CursoConverter cursoConverter;

	@Override
	public CursoModel addCurso(CursoModel cursoModel) {
		Curso curso = cursoRepository.save(cursoConverter.modelToEntity(cursoModel));
		return cursoConverter.entityToModel(curso);
	}

	@Override
	public Curso findCursoById(String id) {
		return cursoRepository.getOne(id);
	}

	@Override
	public CursoModel findCursoByIdModel(String id) {
		return cursoConverter.entityToModel(findCursoById(id));
	}

	@Override
	public List<CursoModel> listAllCursos() {
		List<Curso> cursos = cursoRepository.findAll();
		List<CursoModel> cursosModel = new ArrayList<>();
		cursos.forEach(curso -> {
			cursosModel.add(cursoConverter.entityToModel(curso));
		});
		return cursosModel;
	}

	@Override
	public List<CursoModel> listCursosByProfesor(String id) {
		/*List<Curso> cursos = cursoRepository.findAllByIdProfesor(id);
		List<CursoModel> cursosModel = new ArrayList<>();
		cursos.forEach(curso -> {
			cursosModel.add(cursoConverter.entityToModel(curso));
		});
		return cursosModel;*/
		return null;
	}

	@Override
	public boolean removeCurso(String id) {
		Curso curso = findCursoById(id);
		if (curso != null) {
			cursoRepository.delete(curso);
			return true;
		}
		return false;
	}

}
