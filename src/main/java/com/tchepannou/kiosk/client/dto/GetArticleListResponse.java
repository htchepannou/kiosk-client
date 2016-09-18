package com.tchepannou.kiosk.client.dto;

import java.util.ArrayList;
import java.util.List;

public class GetArticleListResponse {
    private List<ArticleDto> articles = new ArrayList<>();

    public int getSize() {
        return articles.size();
    }

    public List<ArticleDto> getArticles() {
        return articles;
    }

    public void setArticles(final List<ArticleDto> articles) {
        this.articles = articles;
    }
}
