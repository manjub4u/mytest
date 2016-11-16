package com.mkt.mytest.base;



import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mkt.mytest.base.json.AppError;
import com.mkt.mytest.base.json.ErrorMessage;

@ControllerAdvice
public class AdviceController {
   
    @Autowired
    private MessageSource msgSource;
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorMessage processValidationError(MethodArgumentNotValidException ex) {
      BindingResult result = ex.getBindingResult();
      List<FieldError> errors = result.getFieldErrors();
      return processFieldError(errors);
    }
    
    private ErrorMessage processFieldError(List<FieldError> errors) {
        ErrorMessage errorMessage = new ErrorMessage("Validation failed");
        if (errors != null) {
            Locale currentLocale = LocaleContextHolder.getLocale();
            for (FieldError error : errors) {
                String msg = msgSource.getMessage(error.getDefaultMessage(), null, currentLocale);
                AppError errorJson=new AppError(1, error.getField(), msg, error.getObjectName());
                errorMessage.addError(errorJson);
            }
        }
        return errorMessage;
      }
}
