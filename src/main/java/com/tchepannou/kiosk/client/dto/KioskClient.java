package com.tchepannou.kiosk.client.dto;

public interface KioskClient {
    FeedListResponse getFeeds();

    PublishResponse publishArticle(PublishRequest request);
}
