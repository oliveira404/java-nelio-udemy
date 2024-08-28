package com.projetocompleto.DB;

public class DbIntegrityException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DbIntegrityException(String message) {
        super(message);
    }
}
