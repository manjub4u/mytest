package com.mkt.mytest.base.json;

import java.util.ArrayList;
import java.util.List;

public class ErrorMessage {

    String errorMessage;

    List<AppError> errors = new ArrayList<AppError>();

    public ErrorMessage(String message) {
        this.errorMessage=message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<AppError> getErrors() {
        return errors;
    }

    public void addError(AppError error) {
        errors.add(error);
    }

}
