package edu.sistemas.unmsm.asistenciasprofesor.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.sistemas.unmsm.asistenciasprofesor.entity.Users;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<Users, Serializable> {
	
	public abstract Users findByUsername(String username);
	
}
