package com.example.course.services.exceptions;
//exceção da camada de serviço
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id){
         super("Resource not found. Id " +id);
    }
}
