package edu.sistemas.unmsm.asistenciasprofesor.service;

//public class UsuarioService {}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.sistemas.unmsm.asistenciasprofesor.converter.impl.ProfesorConverter;
import edu.sistemas.unmsm.asistenciasprofesor.entity.Profesor;
import edu.sistemas.unmsm.asistenciasprofesor.entity.Usuario;
import edu.sistemas.unmsm.asistenciasprofesor.entity.UsuarioRol;
import edu.sistemas.unmsm.asistenciasprofesor.model.ProfesorModel;
import edu.sistemas.unmsm.asistenciasprofesor.repository.UsuarioRepository;;

@Service("userService")
public class UsuarioService implements UserDetailsService{
	@Autowired
	@Qualifier("usuarioRepository")
	private UsuarioRepository userRepository;
	
	@Autowired
	@Qualifier("profesorConverter")
	private ProfesorConverter profesorConverter;
	
	private static final Log LOG = LogFactory.getLog(UsuarioService.class);
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		edu.sistemas.unmsm.asistenciasprofesor.entity.Usuario user = userRepository.findByUsername(username);
		LOG.info(user);
		LOG.info(userRepository.findById(username));
		
		List<GrantedAuthority> authorities = buildAuthorities(user.getUsuarioRolList());
		return buildUser(user, authorities);
	}
	
	private User buildUser (edu.sistemas.unmsm.asistenciasprofesor.entity.Usuario user, List<GrantedAuthority> authorities) {
		return new User(user.getUsername(), user.getPassword(), user.getHabilitado(), 
				true, true, true, authorities);
	}
	
	private List<GrantedAuthority> buildAuthorities(List<UsuarioRol> list) {
		Set<GrantedAuthority> auths = new HashSet<GrantedAuthority>();

		list.forEach( ur -> auths.add(new SimpleGrantedAuthority(ur.getRol())));
		
		return new ArrayList<GrantedAuthority>(auths);
	}
	
	public ProfesorModel usuarioAutenticado() {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		UserDetails userDetails = (UserDetails) auth.getPrincipal();
		
		if(userDetails != null) {
			Profesor profesor = userRepository.findByUsername(userDetails.getUsername()).getIdProfesor();
			return profesorConverter.entityToModel(profesor);
		}
		
		return null;
		
	}

}