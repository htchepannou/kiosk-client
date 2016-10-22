package com.tchepannou.kiosk.client.dto;

public class GetWebsiteResponse extends AbstractResponse {
    private WebsiteDto website;

    public WebsiteDto getWebsite() {
        return website;
    }

    public void setWebsite(final WebsiteDto website) {
        this.website = website;
    }
}
