package co.grandcircus.coffeeshoplab19;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopLab19Controller {
	
	@RequestMapping("/")
	public ModelAndView showHomePage() {
		ModelAndView mav = new ModelAndView("index"); //Name of View We're Using
	    return mav; 
	
	}
	
	@RequestMapping("/registration")
	public ModelAndView showRegistrationPage() {
		ModelAndView mav = new ModelAndView("registration"); //Name of View We're Using
	    return mav; 
	}
	
	@RequestMapping("/summary")
	public ModelAndView showSummaryPage(
			@RequestParam("firstName") String firstName, 
			@RequestParam("lastName") String lastName, 
			@RequestParam("email") String email, 
			@RequestParam("phoneNumber") String phoneNum, 
			@RequestParam("password") String password) {
	
	    ModelAndView mav = new ModelAndView("summary"); //Name of View We're Using  
		mav.addObject("firstname", firstName);
		mav.addObject("lastname", lastName);
		mav.addObject("email", email);
		mav.addObject("phone", phoneNum);
		mav.addObject("password", password);
        return mav;  
	}
}
