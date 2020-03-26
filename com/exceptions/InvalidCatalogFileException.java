package com.exceptions;

public class InvalidCatalogFileException extends Exception {
    public InvalidCatalogFileException() {
        super("The specified file doesn't contain a valid catalog!");
    }
}
