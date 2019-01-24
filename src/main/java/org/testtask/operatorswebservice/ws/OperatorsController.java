package org.testtask.operatorswebservice.ws;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.testtask.operatorswebservice.model.BaseResponse;
import org.testtask.operatorswebservice.model.ErrorResponse;
import org.testtask.operatorswebservice.model.Operator;
import org.testtask.operatorswebservice.model.OperatorQuery;
import org.testtask.operatorswebservice.model.SuccessSearchResponse;
import org.testtask.operatorswebservice.services.OperatorsService;

@RestController
@RequestMapping("/ws/operators")
public class OperatorsController {

    private OperatorsService service;

    @Autowired
    public OperatorsController(OperatorsService service) {
        this.service = service;
    }

    @ExceptionHandler(Exception.class)
    public BaseResponse handleException(Exception ex) {
        return getError(ex);
    }

    @PostMapping("/search")
    public SuccessSearchResponse getOperator(@Valid @RequestBody OperatorQuery query) {
        return service.getOperator(query);
    }

    private ErrorResponse getError(Exception ex) {
        return new ErrorResponse(ex.getMessage());
    }
}
