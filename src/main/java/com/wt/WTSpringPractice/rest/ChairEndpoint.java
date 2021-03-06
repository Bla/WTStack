package com.wt.WTSpringPractice.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wt.WTSpringPractice.controller.ChairService;
import com.wt.WTSpringPractice.domain.Chair;

@RestController
public class ChairEndpoint {
	
	@Autowired
	ChairService chairService;
	
	@GetMapping("/chair/test")
	public String testing() {
		return "<b><i>GREAT SUCCESS</i></b>";
	}
	
	@GetMapping("/chair/testjson")
	public Map<String, String> sayHello() {
	    HashMap<String, String> map = new HashMap<>();
	    map.put("id", "0");
	    map.put("name", "CHAAAAIRS");
	    map.put("price", "50");
	    return map;
	}
	
	@GetMapping("/chair/all")
	public Iterable<Chair> getAllChairs() {
		return chairService.findAll();
	}
	
	@PostMapping(path = "/chair/add", consumes = "application/json", produces = "text/plain")
	public String addChair(@RequestBody Chair chair) {
		chairService.save(chair);
		return "Chair added";
	}
}
