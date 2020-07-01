package com.wt.WTSpringPractice.rest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wt.WTSpringPractice.domain.Tablee;
import com.wt.WTSpringPractice.persistence.TableeRepository;

@RestController
public class TableeEndpoint {

	@Autowired
	private TableeRepository tableeRepository;

	@GetMapping("/tablee/test")
	public String testing() {
		Random r = new Random();
		int num = r.nextInt(800);
		String str = "<b><i>TAFEL</i></b>";
		String content = String.join(" ", Collections.nCopies(num, str));
		return "Ik zie alleen maar <a href='https://youtu.be/hnq8-2-NikU?t=76' target='_blank'>tafels</a><br><br>"
				+ content;
	}

	@GetMapping("/tablee/testjson")
	public Map<String, String> sayHello() {
		HashMap<String, String> map = new HashMap<>();
		map.put("id", "0");
		map.put("name", "TABLEEeeeE");
		map.put("price", "50");
		return map;
	}

	@GetMapping("/tablee/all")
	public @ResponseBody Iterable<Tablee> getAllTablees() {
		return tableeRepository.findAll();
	}
	
	@PostMapping(path = "/tablee/add", consumes = "application/json", produces = "text/plain")
	public String addTablee(@RequestBody Tablee tablee) {
		tableeRepository.save(tablee);
		return "Tablee added";
	}

}
