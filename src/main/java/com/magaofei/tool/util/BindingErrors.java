package com.magaofei.tool.util;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MAMIAN
 */
public class BindingErrors {

    public static List<String> errors (BindingResult bindingResult) {

        List<String> errorMessage = new ArrayList<>();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        for (FieldError fieldError : fieldErrors) {
            errorMessage.add(fieldError.getField() + " " + fieldError.getObjectName() + " " + fieldError.getDefaultMessage());
        }
        return errorMessage;
    }
}
