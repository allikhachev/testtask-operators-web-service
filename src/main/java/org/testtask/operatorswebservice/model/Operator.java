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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFarth() {
        return farth;
    }

    public void setFarth(String farth) {
        this.farth = farth;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Short getRole() {
        return role;
    }

    public void setRole(Short role) {
        this.role = role;
    }

    public String getDpFIO() {
        return dpFIO;
    }

    public void setDpFIO(String dpFIO) {
        this.dpFIO = dpFIO;
    }

    public String getLogname() {
        return logname;
    }

    public void setLogname(String logname) {
        this.logname = logname;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public Byte getNoVisible() {
        return noVisible;
    }

    public void setNoVisible(Byte noVisible) {
        this.noVisible = noVisible;
    }

    public Integer getOtdelId() {
        return otdelId;
    }

    public void setOtdelId(Integer otdelId) {
        this.otdelId = otdelId;
    }

    public UUID getGlobalKey() {
        return globalKey;
    }

    public void setGlobalKey(UUID globalKey) {
        this.globalKey = globalKey;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Short getRabbitStatus() {
        return rabbitStatus;
    }

    public void setRabbitStatus(Short rabbitStatus) {
        this.rabbitStatus = rabbitStatus;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getSyncOtdelId() {
        return syncOtdelId;
    }

    public void setSyncOtdelId(Integer syncOtdelId) {
        this.syncOtdelId = syncOtdelId;
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
