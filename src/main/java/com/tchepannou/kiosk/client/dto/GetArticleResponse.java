package com.tchepannou.kiosk.client.dto;

public class GetArticleResponse extends AbstractResponse {
    private ArticleDto article;

    public ArticleDto getArticle() {
        return article;
    }

    public void setArticle(final ArticleDto article) {
        this.article = article;
    }
}
