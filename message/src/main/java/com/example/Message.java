package com.example;

public class Message {

    private String service;
    private String essage;

    public Message() {
    }

    public Message(String service, String essage) {
        this.service = service;
        this.essage = essage;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getEssage() {
        return essage;
    }

    public void setEssage(String essage) {
        this.essage = essage;
    }
}
