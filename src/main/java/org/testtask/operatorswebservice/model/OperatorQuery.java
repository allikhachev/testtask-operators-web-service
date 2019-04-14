package org.testtask.operatorswebservice.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OperatorQuery {

    @NotNull
    private String snils;
}
