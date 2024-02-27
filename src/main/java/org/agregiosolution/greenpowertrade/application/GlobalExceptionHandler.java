package org.agregiosolution.greenpowertrade.application;

import org.agregiosolution.greenpowertrade.domain.exceptions.InconsistentContributionException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InconsistentContributionException.class)
    protected ResponseEntity<String> handleInconsistentContributionException(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
