package com.wt.WTSpringPractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wt.WTSpringPractice.domain.Chair;

@Service
@Transactional
public class ChairService {
	
	@Autowired
	ChairRepository chairRepository;
	
	public Chair save(Chair chair){
		return chairRepository.save(chair);
	}
	
	public Iterable<Chair> findAll(){
		Iterable<Chair> result = chairRepository.findAll();
		return result;
	}
}
