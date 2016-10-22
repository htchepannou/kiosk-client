package com.tchepannou.kiosk.client.dto.impl;

import com.tchepannou.kiosk.client.dto.GetArticleListResponse;
import com.tchepannou.kiosk.client.dto.GetArticleResponse;
import com.tchepannou.kiosk.client.dto.GetFeedListResponse;
import com.tchepannou.kiosk.client.dto.GetWebsiteListResponse;
import com.tchepannou.kiosk.client.dto.GetWebsiteResponse;
import com.tchepannou.kiosk.client.dto.KioskClient;
import com.tchepannou.kiosk.client.dto.KioskClientException;
import com.tchepannou.kiosk.client.dto.PublishRequest;
import com.tchepannou.kiosk.client.dto.PublishResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class DefaultKioskClient implements KioskClient {
    private static final String ARTICLE_PATH = "/kiosk/v1/articles";
    private static final String FEED_PATH = "/kiosk/v1/feeds";
    private static final String WEBSITE_PATH = "/kiosk/v1/websites";

    private final RestTemplate restTemplate;
    private final String baseUrl;

    public DefaultKioskClient(final String baseUrl, final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.baseUrl = baseUrl;
    }

    @Override
    public GetFeedListResponse getFeeds() {
        try {
            final URI uri = new URI(baseUrl + FEED_PATH);
            return restTemplate.getForObject(uri, GetFeedListResponse.class);
        } catch (final RestClientException | URISyntaxException ex) {
            throw new KioskClientException(ex);
        }
    }

    public GetWebsiteResponse getWebsite (final String id){
        try {
            final URI uri = new URI(baseUrl + WEBSITE_PATH + "/" + id);
            return restTemplate.getForObject(uri, GetWebsiteResponse.class);
        } catch (final RestClientException | URISyntaxException ex) {
            throw new KioskClientException(ex);
        }
    }

    @Override
    public GetWebsiteListResponse getWebsites () {
        try {
            final URI uri = new URI(baseUrl + WEBSITE_PATH);
            return restTemplate.getForObject(uri, GetWebsiteListResponse.class);
        } catch (final RestClientException | URISyntaxException ex) {
            throw new KioskClientException(ex);
        }
    }

    @Override
    public GetArticleResponse getArticle(final String articleId) {
        try {
            final URI uri = new URI(baseUrl + ARTICLE_PATH + "/" + articleId);
            return restTemplate.getForObject(uri, GetArticleResponse.class);
        } catch (final RestClientException | URISyntaxException ex) {
            throw new KioskClientException(ex);
        }
    }

    @Override
    public boolean isArticleUrlPublished(final String url) {
        try {
            final URI uri = new URI(String.format("%s%s/find?url=%s&includeContent=false", baseUrl, ARTICLE_PATH, url));
            restTemplate.getForObject(uri, GetArticleResponse.class);
            return true;
        } catch (HttpStatusCodeException ex) {
            if (HttpStatus.NOT_FOUND.equals(ex.getStatusCode())){
                return false;
            } else {
                throw new KioskClientException(ex);
            }
        }
        catch (URISyntaxException | RestClientException ex) {
            throw new KioskClientException(ex);
        }
    }

    @Override
    public GetArticleListResponse getArticlesByStatus(final String status) {
        try {
            final URI uri = new URI(baseUrl + ARTICLE_PATH + "/status/" + status);
            return restTemplate.getForObject(uri, GetArticleListResponse.class);
        } catch (final RestClientException | URISyntaxException ex) {
            throw new KioskClientException(ex);
        }
    }

    @Override
    public PublishResponse publishArticle(final PublishRequest request) {
        try {
            final URI uri = new URI(baseUrl + ARTICLE_PATH);
            return restTemplate.postForEntity(uri, request, PublishResponse.class).getBody();
        } catch (final RestClientException | URISyntaxException ex) {
            throw new KioskClientException(ex);
        }
    }
}
