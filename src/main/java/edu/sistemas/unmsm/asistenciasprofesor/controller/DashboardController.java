package edu.sistemas.unmsm.asistenciasprofesor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sistemas.unmsm.asistenciasprofesor.constants.ViewConstants;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
	
	@GetMapping("")
	public String index() {
		return ViewConstants.DASHBOARD_INDEX;
	}
}
