package com.twilioexample.twilioexample.payload;

public class SMSRequest {

    private String to;
    private  String message;

    //getter and setters

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
