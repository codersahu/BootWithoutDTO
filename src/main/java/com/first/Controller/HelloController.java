package com.first.Controller;

import org.springframework.web.bind.annotation.GetMapping;
/*import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;*/
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//We can also use GetMapping in place of RequestMapping cause in requestmapping we have to use much code like methods and in GetMapping just use GetMapping anotation
	/*
	 * @RequestMapping(value="/", method = RequestMethod.GET) public String Hello()
	 * { return("This is my first API"); }
	 */
	@GetMapping("/")
	public String Hello()
	{
		return ("This is my second API");
	}
	

}
