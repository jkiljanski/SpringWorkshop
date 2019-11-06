package com.krow.soft.springTutorial.domain;

public class KrowaException extends RuntimeException {
    public KrowaException() {
        super("Krowa not supported");
    }

}
