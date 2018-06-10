package edu.sistemas.unmsm.asistenciasprofesor.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.sistemas.unmsm.asistenciasprofesor.entity.Curso;

@Repository("cursoRepository")
public interface CursoRepository extends JpaRepository<Curso, Serializable> {

	/*@Query("SELECT c FROM Curso c WHERE c.idProfesor.idProfesor = :idProfesor")
	public abstract List<Curso> findAllByIdProfesor (@Param("idProfesor") String id);*/
	
}
