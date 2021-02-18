/*
 * TestController.java
 *
 * Created on 2017-07-23, 7:28
 */
package com.example.angularboot;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

	@GetMapping("api/hello-world")
	public Authentication helloWorld(){
		return SecurityContextHolder.getContext().getAuthentication();
	}

	@GetMapping("hello-world")
	public String hello(){
		return "Hello, Un secured API accessed successfully";
	}

	@PostMapping("unauthenticated")
   @ResponseStatus(HttpStatus.UNAUTHORIZED)
	public String login(){
      return "oAuth2AuthorizationRequest.";
	}

}
