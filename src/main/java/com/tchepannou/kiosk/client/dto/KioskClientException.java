package com.tchepannou.kiosk.client.dto;

import org.springframework.web.client.HttpStatusCodeException;

public class KioskClientException extends RuntimeException {
    private int httpStatus;

    public KioskClientException(Throwable cause) {
        super(cause);

        if (cause instanceof HttpStatusCodeException){
            httpStatus = ((HttpStatusCodeException)cause).getStatusCode().value();
        }
    }

    public int getHttpStatus() {
        return httpStatus;
    }
}
