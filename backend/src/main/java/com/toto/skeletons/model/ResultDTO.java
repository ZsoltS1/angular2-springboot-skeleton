package com.toto.skeletons.model;

import java.io.Serializable;
import java.util.Date;

public class ResultDTO implements Serializable {

    private Date currentDate;

    private String versionNumber;

    private String message;

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
