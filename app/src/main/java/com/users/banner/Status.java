package com.users.banner;


import java.util.List;

public class Status {

    private String status;

    private String message;

    public String getStatus() {
        return status;
    }

    public Status(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
