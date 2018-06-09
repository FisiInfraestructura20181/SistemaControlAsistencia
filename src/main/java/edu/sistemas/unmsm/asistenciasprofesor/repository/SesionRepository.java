package edu.sistemas.unmsm.asistenciasprofesor.repository;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import edu.sistemas.unmsm.asistenciasprofesor.entity.Sesion;

@Repository("sesionRepository")
public interface SesionRepository extends JpaRepository<Sesion, Serializable>{
	
	@Query("SELECT s FROM Sesion s WHERE s.grupo.idGrupo = :idCurso")
	public abstract List<Sesion> findAllByIdCurso (@Param("idCurso") String id);
	
}
