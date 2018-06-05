package edu.sistemas.unmsm.asistenciasprofesor.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.sistemas.unmsm.asistenciasprofesor.entity.Profesor;

@Repository("profesorRepository")
public interface ProfesorRepository extends JpaRepository<Profesor, Serializable> {
	
}
