package com.example.validation.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidAgeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleInvalidAge(InvalidAgeException ex) {
        return ex.getMessage();
    }
}