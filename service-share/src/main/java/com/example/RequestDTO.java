package com.example;

import java.io.Serializable;

public class RequestDTO implements Serializable {

    private static final long serialVersionUID = 123456L;

    private String stringOne;
    private String stringTwo;
    private Integer integerOne;

    public RequestDTO() {
    }

    public RequestDTO(String stringOne, String stringTwo, Integer integerOne) {
        this.stringOne = stringOne;
        this.stringTwo = stringTwo;
        this.integerOne = integerOne;
    }

    public String getStringOne() {
        return stringOne;
    }

    public void setStringOne(String stringOne) {
        this.stringOne = stringOne;
    }

    public String getStringTwo() {
        return stringTwo;
    }

    public void setStringTwo(String stringTwo) {
        this.stringTwo = stringTwo;
    }

    public Integer getIntegerOne() {
        return integerOne;
    }

    public void setIntegerOne(Integer integerOne) {
        this.integerOne = integerOne;
    }
}
