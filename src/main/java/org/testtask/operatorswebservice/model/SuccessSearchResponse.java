package org.testtask.operatorswebservice.model;

import org.testtask.operatorswebservice.model.Operator.Position;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessSearchResponse extends BaseResponse {

    private Integer id;
    private String surname;
    private String name;
    private String patronymic;
    private Operator.Position position;
    private String branch;

    public SuccessSearchResponse(final Boolean success, final String description) {
        super(success, description);
        branch = "Уполномоченный МФЦ";
    }

    public SuccessSearchResponse() {
        this(true, "Операция выполнена успешно");
        branch = "Уполномоченный МФЦ";
    }

    public SuccessSearchResponse(final Integer id,
            final String surname, final String name,
            final String patronymic, final Position position) {
        this();
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
    }
}
