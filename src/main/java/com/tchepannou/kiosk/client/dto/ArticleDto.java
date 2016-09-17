package com.tchepannou.kiosk.client.dto;

public class ArticleDto {
    private String id;
    private String status;
    private ArticleDataDto data = new ArticleDataDto();

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public ArticleDataDto getData() {
        return data;
    }

    public void setData(final ArticleDataDto data) {
        this.data = data;
    }
}
