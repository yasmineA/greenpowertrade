package org.agregiosolution.greenpowertrade.application;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataAccessException.class)
    protected ResponseEntity<String> handleDatabaseException(Exception ex, WebRequest request) {
        return new ResponseEntity<>("Erreur lors de l'accès à la base de données.", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
