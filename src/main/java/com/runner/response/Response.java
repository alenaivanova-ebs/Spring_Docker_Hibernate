package com.runner.response;

public class Response {

    private int status;
    private String errorMessage;
    private String errorCode;

    public Response() {
    }

    public Response(int status, String errorMessage, String errorCode) {
        this.status = status;
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
