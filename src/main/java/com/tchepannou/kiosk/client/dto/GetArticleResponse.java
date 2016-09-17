package com.tchepannou.kiosk.client.dto;

import java.util.ArrayList;
import java.util.List;

public class GetArticleResponse extends AbstractResponse {
    private List<ArticleDto> articles = new ArrayList<>();

    public List<ArticleDto> getArticles() {
        return articles;
    }
}
