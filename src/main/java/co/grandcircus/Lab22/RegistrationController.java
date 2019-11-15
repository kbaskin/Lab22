package co.grandcircus.Lab22;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

//	@Autowired
//	private Person p;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index", "register", "Register Here!");
		return mv;
	}


}
