package edu.sistemas.unmsm.asistenciasprofesor.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import edu.sistemas.unmsm.asistenciasprofesor.constants.ViewConstants;

@Controller
@RequestMapping("")
public class LoginController {
	
	private static final Log LOG = LogFactory.getLog(LoginController.class);
	
	@GetMapping("/login")
	public String showLoginPage(Model model,
			@RequestParam(name="error", required=false) String error,
			@RequestParam(name="logout", required=false) String logout) {
		
		LOG.info("METHOD: showLoginPage() -- PARAMS: error=" + error + ", logout=" + logout);
		
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		
		return ViewConstants.LOGIN;
	}
	
	@GetMapping("/loginsuccess")
	public String loginSuccess() {
		LOG.info("METHOD: loginSuccess()");
		
		return "redirect:/dashboard";
	}
}
