package org.testtask.operatorswebservice.model;

import javax.persistence.Column;

public class SuccessSearchResponse extends BaseResponse {

    private Integer id;
    private String surname;
    private String name;
    private String patronymic;
    private Operator.Position position;
    private String branch = "Уполномоченный МФЦ";

    public SuccessSearchResponse() {
        super(true, "Операция выполнена успешно");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Operator.Position getPosition() {
        return position;
    }

    public void setPosition(Operator.Position position) {
        this.position = position;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
