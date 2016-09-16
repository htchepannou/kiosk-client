package com.tchepannou.kiosk.client.dto;

import java.util.ArrayList;
import java.util.List;

public class FeedListResponse extends AbstractResponse {
    private List<FeedDto> feeds = new ArrayList<>();

    public int getSize() {
        return feeds.size();
    }

    public List<FeedDto> getFeeds() {
        return feeds;
    }

    public void setFeeds(final List<FeedDto> feeds) {
        this.feeds = feeds;
    }
}
