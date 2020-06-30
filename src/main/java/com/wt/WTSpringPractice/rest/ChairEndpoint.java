package com.wt.WTSpringPractice.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wt.WTSpringPractice.domain.Chair;

@RestController
public class ChairEndpoint {
	
	@Autowired
	private ChairRepository chairRepository;
	
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
	public @ResponseBody Iterable<Chair> getAllChairs() {
		return chairRepository.findAll();
	}
	
	/*
	 * @PostMapping("/chair/add") public String addChair() { return
	 * "<b><i>chair added</i></b>"; }
	 */
}
