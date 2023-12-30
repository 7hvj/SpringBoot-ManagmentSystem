package com.codewithme.BackendApplication.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could Not Found user with id : "+id);
    }
}
