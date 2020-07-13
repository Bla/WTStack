package com.wt.WTSpringPractice.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.wt.WTSpringPractice.domain.Tablee;

@Component
public interface TableeRepository extends CrudRepository<Tablee, Integer> {

}
