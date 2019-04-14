package org.testtask.operatorswebservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponse {

    private Boolean success;
    private String description;

    public BaseResponse(Boolean success, String description) {
        this.success = success;
        this.description = description;
    }

    public BaseResponse() {
        this(true, "Успешно добавлено");
    }
}
