package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final Long serialVersionUID = 1l;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }
    
}
