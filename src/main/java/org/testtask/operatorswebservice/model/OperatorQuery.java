package org.testtask.operatorswebservice.model;

import javax.validation.constraints.NotNull;

public class OperatorQuery {
    @NotNull
    private String snils;

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }
}
