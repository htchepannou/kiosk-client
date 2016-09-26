package com.tchepannou.kiosk.client.dto;

import com.google.gson.Gson;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Map;

public class KioskClientException extends RuntimeException {
    private int httpStatus;
    private ErrorDto error;

    public KioskClientException(final Throwable cause) {
        super(cause);

        if (cause instanceof HttpClientErrorException) {
            httpStatus = ((HttpClientErrorException) cause).getStatusCode().value();
            extractError((HttpClientErrorException) cause);
        }
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public ErrorDto getError (){
        return error;
    }

    private void extractError(final HttpClientErrorException ex){
        final Map<String, Object> body = (Map)new Gson().fromJson(ex.getResponseBodyAsString(), Object.class);
        if (body.containsKey("error")){
            Map<String, String> errorMap = (Map)body.get(body.get("error"));
            if (errorMap != null) {
                this.error = new ErrorDto(errorMap.get("code"), errorMap.get("message"));
            }
        }
    }
}
