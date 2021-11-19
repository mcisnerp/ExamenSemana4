package com.example.ExamenSemana4.config;

import com.example.ExamenSemana4.exception.InexistenteException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionInexistenteHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({InexistenteException.class})
    protected ResponseEntity<Object> InexistenteException(
            Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getCause().getMessage(),
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

}
