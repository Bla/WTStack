package com.wt.WTSpringPractice.rest;

import org.springframework.data.repository.CrudRepository;
import com.wt.WTSpringPractice.domain.Chair;

public interface ChairRepository extends CrudRepository<Chair, Integer> {

}
