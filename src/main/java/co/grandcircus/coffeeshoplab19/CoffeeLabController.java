package co.grandcircus.coffeeshoplab19;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeLabController {
    
	@Autowired 
    private CoffeeShopHibernateItemDao coffeeShopHibernateItemDao; 
    	
	@RequestMapping("/")
	public ModelAndView showHomePage() {
		List<Item> items = coffeeShopHibernateItemDao.findAll();  
		System.out.println(items);
		ModelAndView mav = new ModelAndView("index");  //Name of View We're Using
	    mav.addObject("items", items); 
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
		@RequestParam("gender") String gender, 
		@RequestParam("phoneNum") String phoneNum, 
		@RequestParam("password") String password)  {
		
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPhoneNum(phoneNum);
		user.setPassword(password);
	
	    ModelAndView mav = new ModelAndView("summary"); //Name of View We're Using  
		mav.addObject("user", user);
		
        return mav;  
	}
	
}
	

