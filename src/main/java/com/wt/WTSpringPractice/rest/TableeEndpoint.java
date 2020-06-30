package com.wt.WTSpringPractice.rest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wt.WTSpringPractice.domain.Tablee;

@RestController
public class TableeEndpoint {
	
	@Autowired
	private TableeRepository tableeRepository;
	
	@GetMapping("/table/test")
	public String testing() {
		Random r = new Random();
		int num = r.nextInt(800);
		String str = "<b><i>TAFEL</i></b>";
		String content = String.join(" ", Collections.nCopies(num, str));
		return "Ik zie alleen maar tafels<br><br>" + content;
	}
	
	@GetMapping("/table/testjson")
	public Map<String, String> sayHello() {
	    HashMap<String, String> map = new HashMap<>();
	    map.put("id", "0");
	    map.put("name", "TABLEEeeeE");
	    map.put("price", "50");
	    return map;
	}
	
	@GetMapping("/table/all")
	public @ResponseBody Iterable<Tablee> getAllTablees() {
		return tableeRepository.findAll();
	}
	
	/*
	 * @PostMapping("/table/add") public String addTable() { return
	 * "<b><i>table added</i></b>"; }
	 */
}
