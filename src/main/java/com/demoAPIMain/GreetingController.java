package com.demoAPIMain;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	// code after first commit
	
	@GetMapping("/greet/{name}")
	public String greetWithName(@PathVariable String name) {
		return "Hello " +name+ "!";
	}
	
	@PostMapping("/greet")
	public String createGreeting(@RequestBody String name) {
		return "Hello " +name+ "! created";
	}
	
	@PutMapping("/greet/{id}")
	public String updateGreeting(@PathVariable String id, @RequestBody String name) {
		// Process the request to update the greeting with the provided ID
		return "Hello " +name+ "! updated";
	}
	
	@DeleteMapping("/greet/{id}")
	public String deleteGreeting(@PathVariable String id) {
		return "Greeting with id: " +id+ " has been deleted"; 
	}
	
	//git changes
	//changes after git edit, to check weather this merge with git edit
	//changes for merge
	
}
