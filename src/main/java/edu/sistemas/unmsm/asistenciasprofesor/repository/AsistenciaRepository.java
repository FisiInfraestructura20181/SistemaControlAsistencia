package edu.sistemas.unmsm.asistenciasprofesor.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.sistemas.unmsm.asistenciasprofesor.entity.Asistencia;

@Repository("asistenciaRepository")
public interface AsistenciaRepository extends JpaRepository<Asistencia, Serializable>{

	@Query("SELECT a FROM Asistencia a WHERE a.sesion.grupo.curso.idCurso = :idCurso")
	public abstract List<Asistencia> findAllByIdCurso (@Param("idCurso") String id);
	
	@Query("SELECT a FROM Asistencia a WHERE a.asistenciaPK.idSesion = :idSesion")
	public abstract List<Asistencia> findAllByIdSesion (@Param("idSesion") String id);
	
	@Query("SELECT a FROM Asistencia a WHERE a.sesion.idCurso.idCurso = :idCurso AND a.alumno.codigo = :codigo")
	public abstract List<Asistencia> findAllByIdCursoCodigo (@Param("idCurso") String id, 
																@Param("codigo")String codigo);
}
