package com.tchepannou.kiosk.client.dto;

public class PublishRequest {
    private long feedId;
    private ArticleDataDto article;
    private boolean force;

    public long getFeedId() {
        return feedId;
    }

    public void setFeedId(final long feedId) {
        this.feedId = feedId;
    }

    public ArticleDataDto getArticle() {
        return article;
    }

    public void setArticle(final ArticleDataDto article) {
        this.article = article;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(final boolean force) {
        this.force = force;
    }
}
