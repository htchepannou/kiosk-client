package com.tchepannou.kiosk.client.dto;

public class ArticleDto {
    private String id;
    private ArticleDataDto data = new ArticleDataDto();

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public ArticleDataDto getData() {
        return data;
    }

    public void setData(final ArticleDataDto data) {
        this.data = data;
    }
}
