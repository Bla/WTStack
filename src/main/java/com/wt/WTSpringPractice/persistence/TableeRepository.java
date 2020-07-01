package com.wt.WTSpringPractice.persistence;

import org.springframework.data.repository.CrudRepository;
import com.wt.WTSpringPractice.domain.Tablee;

public interface TableeRepository extends CrudRepository<Tablee, Integer> {

}
