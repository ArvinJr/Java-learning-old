package com.exception;

/**
 * @author arvin
 * @date 2021/2/18
 */
public class FreezeUserException extends RuntimeException{
    public FreezeUserException(String message) {
        super(message);
    }
}
