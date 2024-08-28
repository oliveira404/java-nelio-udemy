package com.projetocompleto.DB;

import java.io.Serial;

public class DbIntegrityException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public DbIntegrityException(String message) {
        super(message);
    }
}
