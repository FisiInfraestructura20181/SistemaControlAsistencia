package edu.sistemas.unmsm.asistenciasprofesor.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.sistemas.unmsm.asistenciasprofesor.entity.Usuario;


@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable> {
	
	public abstract Usuario findByUsername(String username);
	
}
