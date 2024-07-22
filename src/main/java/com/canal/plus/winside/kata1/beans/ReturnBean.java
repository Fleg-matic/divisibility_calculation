package com.canal.plus.winside.kata1.beans;

public class ReturnBean {

    private String spring = "Spring";
    private String boot = "Boot";
    private String springBoot = "Spring Boot";
    private String empty = "vide";

    public ReturnBean() {
    }

    public ReturnBean(String spring, String boot, String springBoot, String empty) {
        this.spring = spring;
        this.boot = boot;
        this.springBoot = springBoot;
        this.empty = empty;
    }

    public String getSpring() {
        return spring;
    }

    public void setSpring(String spring) {
        this.spring = spring;
    }

    public String getBoot() {
        return boot;
    }

    public void setBoot(String boot) {
        this.boot = boot;
    }

    public String getSpringBoot() {
        return springBoot;
    }

    public void setSpringBoot(String springBoot) {
        this.springBoot = springBoot;
    }

    public String getEmpty() {
        return empty;
    }

    public void setEmpty(String empty) {
        this.empty = empty;
    }
}
