package com.demoAPIMain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

	@GetMapping("/greet")
	public String greet() {
		return "Hello again";
	}
	
	/* localhost 8080 already in use*/
	/*use this cmd to close the local host connection
	 *  netstat -ano | findstr :8080  --> this cmd will give you the PID
	 *  taskkill /PID <PID> /F        --> use this cmd to kill session and replace <PID> with above
	 */

}
