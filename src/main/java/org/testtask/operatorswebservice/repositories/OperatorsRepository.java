package org.testtask.operatorswebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.testtask.operatorswebservice.model.Operator;

public interface OperatorsRepository extends JpaRepository<Operator, Integer> {
}
