package com.tchepannou.kiosk.client.dto;

public class PublishResponse extends AbstractResponse{
    private String keyhash;

    public String getKeyhash() {
        return keyhash;
    }

    public void setKeyhash(final String keyhash) {
        this.keyhash = keyhash;
    }
}
