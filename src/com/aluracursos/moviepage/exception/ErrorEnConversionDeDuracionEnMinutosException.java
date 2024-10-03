package com.aluracursos.moviepage.exception;

public class ErrorEnConversionDeDuracionEnMinutosException extends RuntimeException {
    private String mensajeDeError;

    public ErrorEnConversionDeDuracionEnMinutosException(String mensajeDeError) {
        this.mensajeDeError = mensajeDeError;
    }

    public String getMensajeDeError() {
        return this.mensajeDeError;
    }
}
