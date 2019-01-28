package org.testtask.operatorswebservice.model;

public class BaseResponse {

    private Boolean success;
    private String description;

    public BaseResponse(Boolean success, String description) {
        this.success = success;
        this.description = description;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
