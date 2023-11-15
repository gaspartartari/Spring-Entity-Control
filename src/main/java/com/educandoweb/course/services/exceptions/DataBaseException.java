package com.educandoweb.course.services.exceptions;

public class DataBaseException extends RuntimeException {
    private static final Long serialVersionUID = 1l;

    public DataBaseException(String msg){
        super(msg);
    }
}
