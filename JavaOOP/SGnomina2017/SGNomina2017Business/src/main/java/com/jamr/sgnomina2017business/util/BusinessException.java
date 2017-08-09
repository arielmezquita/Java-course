
package com.jamr.sgnomina2017business.util;

public class BusinessException extends Exception{
    private String message;

    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }
    
    public String getMessage(){
        return message;
    }
    
    
    
}
