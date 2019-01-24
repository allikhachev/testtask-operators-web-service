package org.testtask.operatorswebservice.model;

public class ErrorResponse extends BaseResponse {

    public ErrorResponse(String description) {
        super(false, description);
    }
}
