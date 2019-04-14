package org.testtask.operatorswebservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse extends BaseResponse {

    public ErrorResponse(String description) {
        super(false, description);
    }
}
