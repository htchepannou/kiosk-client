package com.tchepannou.kiosk.client.dto;

public class ImageDto {
    private String id;
    private String title;
    private String contentType;
    private int width;
    private int height;
    private String publicUrl;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(final String contentType) {
        this.contentType = contentType;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(final int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public String getPublicUrl() {
        return publicUrl;
    }

    public void setPublicUrl(final String publicUrl) {
        this.publicUrl = publicUrl;
    }
}
