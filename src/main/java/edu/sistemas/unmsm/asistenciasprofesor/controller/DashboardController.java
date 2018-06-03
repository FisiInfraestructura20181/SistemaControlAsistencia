package edu.sistemas.unmsm.asistenciasprofesor.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sistemas.unmsm.asistenciasprofesor.constants.ViewConstants;
import edu.sistemas.unmsm.asistenciasprofesor.model.DashboardModel;
/**
 * Controlador que gestiona la pantalla principal 
 * y los enlaces a los demás módulos del sistema.
 * @author lucho
 */
@Controller
@RequestMapping("/dashboard")
public class DashboardController {
	
	// Log del constrolador
	private static final Log LOG = LogFactory.getLog(DashboardController.class);
	
	/**
	 * Vista principal del módulo 'Dashboard'
	 * @param model
	 * @return Ruta de la plantilla para la ruta '/dashboard'
	 */
	@GetMapping("")
	public String index(Model model) {
		
		// Creamos un objeto de la clase 'DashboardModel'
		DashboardModel dashboard = new DashboardModel();
		dashboard.setNroCursos(5);
		dashboard.setProxCurso("Infraestructura y Seguridad en Redes");
		
		// Salida de log
		LOG.info("-- Ruta: [/dashboard/index] -> Establecimiento de atributo: " + dashboard);
		
		// Agregamos un elemento de prueba de la clase 'DashboardModel'
		model.addAttribute("dashboard", dashboard);
		
		// Devolvemos la vista de '/templates/dashboard/index.html'
		return ViewConstants.DASHBOARD_INDEX;
	}
}
