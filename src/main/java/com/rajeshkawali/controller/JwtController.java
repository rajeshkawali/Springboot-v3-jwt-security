package com.rajeshkawali.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Rajesh_Kawali
 *
 */
@RestController
@RequestMapping("/api/v1")
public class JwtController {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome() {
		return ResponseEntity.ok("Welcome to jwt secured endpoint");
	}

}