package com.canal.plus.winside.kata1.beans;

public class KataBean {

    private int numberBase;
    private int number;

    public KataBean() {
    }

    public KataBean(int numberBase, int number) {
        this.numberBase = numberBase;
        this.number = number;
    }

    public int getNumberBase() {
        return numberBase;
    }

    public void setNumberBase(int numberBase) {
        this.numberBase = numberBase;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
