package com.tchepannou.kiosk.client.dto;

import java.util.ArrayList;
import java.util.List;

public class GetWebsiteListResponse extends AbstractResponse {
    private List<WebsiteDto> websites = new ArrayList<>();

    public int getSize() {
        return websites.size();
    }

    public List<WebsiteDto> getWebsites() {
        return websites;
    }

    public void setWebsites(final List<WebsiteDto> websites) {
        this.websites = websites;
    }
}
