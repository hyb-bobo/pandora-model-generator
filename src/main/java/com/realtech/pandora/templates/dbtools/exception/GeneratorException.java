package com.realtech.pandora.templates.dbtools.exception;

/**
 * Created by admin on 2017/5/8.
 */
public class GeneratorException extends Exception {

    public GeneratorException() {
        super();
    }

    public GeneratorException(String message) {
        super(message);
    }

    public GeneratorException(String message, Throwable cause) {
        super(message, cause);
    }

    public GeneratorException(Throwable cause) {
        super(cause);
    }

    protected GeneratorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}