package com.meusestudos.course.services.exceptions;


public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Long objectId) {
        super("Recurso Não Encontrado de ID: " + objectId);
    }
}
