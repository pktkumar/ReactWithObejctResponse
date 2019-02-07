package com.homedepot.sa.im.inventorymanagementproductdetails.to.response;

import java.util.Objects;

public class ErrorResponse {
    private String errorLink;
    private int code;
    private String message;

    public ErrorResponse(int code, String message){
        this.code = code;
        this.message = message;
    }

    public ErrorResponse(){

    }
    public String getErrorLink() {
        return errorLink;
    }

    public void setErrorLink(String errorLink) {
        this.errorLink = errorLink;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErrorResponse that = (ErrorResponse) o;
        return code == that.code &&
                Objects.equals(errorLink, that.errorLink) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {

        return Objects.hash(errorLink, code, message);
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "errorLink='" + errorLink + '\'' +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
