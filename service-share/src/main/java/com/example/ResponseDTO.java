package com.example;

import java.io.Serializable;

public class ResponseDTO implements Serializable {
    
    private static final long serialVersionUID = 234567L;
    
    private String response;
    private Long errorCode;

    public ResponseDTO(String response, Long errorCode) {
        this.response = response;
        this.errorCode = errorCode;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
    }
}
