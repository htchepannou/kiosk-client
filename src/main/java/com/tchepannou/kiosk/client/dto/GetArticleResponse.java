package com.tchepannou.kiosk.client.dto;

public class GetArticleResponse extends AbstractResponse {
    private ArticleDto article;
    private WebsiteDto website;
    private ImageDto image;

    public ArticleDto getArticle() {
        return article;
    }

    public void setArticle(final ArticleDto article) {
        this.article = article;
    }

    public WebsiteDto getWebsite() {
        return website;
    }

    public void setWebsite(final WebsiteDto website) {
        this.website = website;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(final ImageDto image) {
        this.image = image;
    }
}
