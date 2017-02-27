package com.krow.soft.springTutorial.domain;

public class SwearInFirstnameException extends RuntimeException {
    public SwearInFirstnameException() {
        super("Cannot put swears in firstname!!!!");
    }
}
