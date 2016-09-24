package com.tchepannou.kiosk.client.dto;

public interface KioskClient {
    GetFeedListResponse getFeeds();

    GetWebsiteListResponse getWebsites ();

    GetArticleResponse getArticle (final String articleId);

    GetArticleListResponse getArticlesByStatus (final String status);

    PublishResponse publishArticle(PublishRequest request);
}
