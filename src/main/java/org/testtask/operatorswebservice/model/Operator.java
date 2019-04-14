package org.testtask.operatorswebservice.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "operators")
public class Operator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_operator", nullable = false)
    private Integer id;
    @Column(name = "Family", length = 50)
    private String family;
    @Column(name = "Name", length = 50)
    private String name;
    @Column(name = "Farth", length = 50)
    private String farth;
    @Column(length = 50)
    private String pass;
    @Column(length = 50)
    private Short role;
    @Column(name = "dp_FIO", length = 150)
    private String dpFIO;
    @Column(length = 50)
    private String logname;
    @Column(name = "log_name", length = 50)
    private String logName;
    @Column(length = 50)
    private String phone;
    @Temporal(TemporalType.DATE)
    @Column(name = "DOB")
    private Date dob;
    @Column(nullable = false)
    private String picture;
    @Column(length = 50)
    private String passport;
    @Column(length = 50)
    private String snils;
    @Column(name = "no_visible")
    private Byte noVisible;
    @Column(name = "id_otdel", nullable = false)
    private Integer otdelId;
    @Column(name = "GlobalKey", nullable = false)
    private UUID globalKey;
    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private Position position;
    @Column(name = "rabbit_status")
    private Short rabbitStatus;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_last_update")
    private Date lastUpdateDate;
    @Column(name = "Id_Otdel_Sync")
    private Integer syncOtdelId;

    @PrePersist
    public void onPrePersist() {
        globalKey = UUID.randomUUID();
        lastUpdateDate = new Date();
    }

    public enum Position {
        OPERATOR("Оператор"), OTHER("Другой");
        @JsonValue
        private String value;

        Position(String value) {
            this.value = value;
        }
    }
}
