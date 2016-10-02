package com.tchepannou.kiosk.client.dto;

public class ArticleDto extends ArticleDataDto {
    private String id;
    private WebsiteDto website;
    private ImageDto image;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public WebsiteDto getWebsite() {
        return website;
    }

    public void setWebsite(final WebsiteDto website) {
        this.website = website;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(final ImageDto image) {
        this.image = image;
    }
}
