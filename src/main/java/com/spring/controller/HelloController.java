package com.spring.controller;
import java.util.Map;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
@Controller  
@RequestMapping("/hello")   //annotation at class level... /hello/hellopage
public class HelloController {  
    @RequestMapping("/hellopage/{name}/{username}")   //by putting {} brackets we can put anything instead of username...
    public ModelAndView helloWorld(@PathVariable Map<String,String> pathvars) {  //instead of this (@PathVariable("username") String name,@PathVariable("name") String country) map can be used to retrieve more url data
    	String name=pathvars.get("username");
    	String country=pathvars.get("name");
    	ModelAndView modelandview=new ModelAndView("hellopage");
		modelandview.addObject("welcomeMessage","Hi..this is first mvc web application"+name+country);
		
		return modelandview;
    }  
}  
/*import org.springframework.context.ApplicationListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView modelandview=new ModelAndView("hellopage");
		modelandview.addObject("welcomeMessage","Hi..this is first mvc web application");
		
		return modelandview;
	}

}
*/