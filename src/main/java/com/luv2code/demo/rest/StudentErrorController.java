package com.luv2code.demo.rest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentErrorController {
    private int status;
    private String message;
    private long timeStamp;

    public StudentErrorController() {}

    public StudentErrorController(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }
}
