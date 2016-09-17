package com.tchepannou.kiosk.client.dto;

public abstract class AbstractArticleResponse extends AbstractResponse {
    private String articleId;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(final String articleId) {
        this.articleId = articleId;
    }
}
