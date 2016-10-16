package com.tchepannou.kiosk.client.dto;

public interface KioskClient {
    GetFeedListResponse getFeeds();

    GetWebsiteListResponse getWebsites ();

    GetArticleResponse getArticle (final String articleId);

    boolean isArticleUrlPublished(final String url);

    GetArticleListResponse getArticlesByStatus (final String status);

    PublishResponse publishArticle(PublishRequest request);
}
