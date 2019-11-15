package co.grandcircus.Lab22;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FormController {
	
//	@Autowired
//	private Person p;
	
//	@RequestMapping("/forms")
//	public String showNewFormPage() {
//		return "registration-form";
//	}

//@RequestMapping("/checkbox-form")
//public ModelAndView checkbox(String vehicle) {
//	String[] vehicles = vehicle.split(",");
//	return new ModelAndView("form-page", "p", vehicles[1]);
//}
	
//	@RequestMapping("/confirm-submit")
//	public ModelAndView home() {
//		// the model and view object allows us to manage the jsp pages we want to show
//		// and the model data that we want to pass in
//		// the first param is the page name
//		// the second param is the model name that will be used in the jsp to represent
//		// using ${test}
//		// the third param with is the model data (we hard coded the Hi message below)
//		ModelAndView mv = new ModelAndView("confirm-submit", "form", "Hi, my name is Katie.");
//		mv.addObject("personTest", p.getFirstName());
//
//		return mv;
//	}
	
	@PostMapping("/registration-form")
	public ModelAndView formDeets(@RequestParam("first") String first, @RequestParam("last") String last,
			@RequestParam("email") String email, @RequestParam("phone") String phone, @RequestParam("password") String password) {
		Person pFromForm = new Person(first, last, email, phone, password);
		return new ModelAndView("registration-form", "p", pFromForm);
	}
	
	@GetMapping("/registration-form")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("registration-form", "register", "Register");
		return mv;
	}
//	
//	@GetMapping("/confirm")
//	public ModelAndView submit() {
//		ModelAndView mv = new ModelAndView("confirm-submit", "register", "Register Here!");
//		return mv;
//	}

}
