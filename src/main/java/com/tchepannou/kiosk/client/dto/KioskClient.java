package com.tchepannou.kiosk.client.dto;

public interface KioskClient {
    GetFeedListResponse getFeeds();

    GetArticleResponse getArticle (final String articleId);

    GetArticleListResponse getArticlesByStatus (final String status);

    PublishResponse publishArticle(PublishRequest request);
}
