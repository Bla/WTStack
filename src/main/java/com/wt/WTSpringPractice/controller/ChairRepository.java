package com.wt.WTSpringPractice.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.wt.WTSpringPractice.domain.Chair;

@Component
public interface ChairRepository extends CrudRepository<Chair, Integer> {

}
