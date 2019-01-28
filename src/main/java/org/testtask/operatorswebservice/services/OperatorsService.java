package org.testtask.operatorswebservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.testtask.operatorswebservice.exception.ResourceNotFoundException;
import org.testtask.operatorswebservice.model.BaseResponse;
import org.testtask.operatorswebservice.model.Operator;
import org.testtask.operatorswebservice.model.OperatorQuery;
import org.testtask.operatorswebservice.model.SuccessSearchResponse;
import org.testtask.operatorswebservice.repositories.OperatorsRepository;

@Service
public class OperatorsService {

    private OperatorsRepository repository;

    @Autowired
    public OperatorsService(OperatorsRepository repository) {
        this.repository = repository;
    }


    public SuccessSearchResponse getOperator(OperatorQuery query) {
        Operator operator = repository.findOne(Example.of(toExample(query)))
                .orElseThrow(ResourceNotFoundException::new);
        return toResponse(operator);
    }

    private SuccessSearchResponse toResponse(Operator operator) {
        SuccessSearchResponse response = new SuccessSearchResponse();
        response.setId(operator.getId());
        response.setSurname(operator.getFamily());
        response.setName(operator.getName());
        response.setPatronymic(operator.getFarth());
        response.setPosition(operator.getPosition());
        return response;
    }

    private Operator toExample(OperatorQuery query) {
        Operator exampleOperator = new Operator();
        exampleOperator.setSnils(query.getSnils());
        return exampleOperator;
    }

    public BaseResponse addOperator(Operator operator) {
        repository.save(operator);
        return new BaseResponse(true, "Успешно добавлено");
    }
}
