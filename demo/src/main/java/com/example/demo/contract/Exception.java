package com.example.demo.contract;

public class Exception {
    public class ValidationException extends RuntimeException {
        public ValidationException(String message) {
            super(message);
        }
    }

}
