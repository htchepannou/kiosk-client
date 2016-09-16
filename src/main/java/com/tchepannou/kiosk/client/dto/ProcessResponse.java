package com.tchepannou.kiosk.client.dto;

public class ProcessResponse extends AbstractResponse{
    private String keyhash;

    public String getKeyhash() {
        return keyhash;
    }

    public void setKeyhash(final String keyhash) {
        this.keyhash = keyhash;
    }
}
