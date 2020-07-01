package com.wt.WTSpringPractice.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wt.WTSpringPractice.domain.Tablee;

@Service
@Transactional
public class TableeService {
	
	@Autowired
	private TableeRepository tableeRepository;
	
	public Tablee save(Tablee tablee){
		return tableeRepository.save(tablee);
	}
	
	public Iterable <Tablee> findAll(){
		Iterable <Tablee> result = tableeRepository.findAll();
		return result;
	}
}
