package com.achieversoft.ecommapp.userservice.common.exception;

import lombok.Data;

/**
 * The type User data exception.
 */
@Data
public class ApplicationException extends RuntimeException{

    private String taskName;
    /**
     * Instantiates a new User data exception.
     *
     * @param message the message
     */
    public ApplicationException(String message){
        super(message);
    }

    public ApplicationException(String message, String taskName){
        super(message);
        this.taskName=taskName;
    }
}
