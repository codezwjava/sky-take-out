package com.sky.exception;

import org.omg.CORBA.PUBLIC_MEMBER;

public class UserAlreadyExitsException extends BaseException{
    public UserAlreadyExitsException(String msg){
        super(msg);
    }
}
