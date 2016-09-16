package com.tchepannou.kiosk.client.dto.impl;

import com.tchepannou.kiosk.client.dto.FeedListResponse;
import com.tchepannou.kiosk.client.dto.KioskClient;
import com.tchepannou.kiosk.client.dto.KioskClientException;
import com.tchepannou.kiosk.client.dto.PublishRequest;
import com.tchepannou.kiosk.client.dto.PublishResponse;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class DefaultKioskClient implements KioskClient {
    private final String baseUrl;
    private final RestTemplate restTemplate;
    private final URI feedUri;
    private final URI publishArticleUri;

    public DefaultKioskClient(final String baseUrl, final RestTemplate restTemplate) {
        try {
            this.baseUrl = baseUrl;
            this.restTemplate = restTemplate;

            feedUri = new URI(baseUrl + "/kiosk/v1/feeds");
            publishArticleUri = new URI(baseUrl + "/kiosk/v1/articles/publish");
        } catch (final URISyntaxException ex) {
            throw new IllegalStateException("Invalid URL", ex);
        }
    }

    @Override
    public FeedListResponse getFeeds() {
        try {
            return restTemplate.getForObject(feedUri, FeedListResponse.class);
        } catch (RestClientException ex) {
            throw new KioskClientException(ex);
        }
    }

    @Override
    public PublishResponse publishArticle(final PublishRequest request) {
        try {
            return restTemplate.postForEntity(publishArticleUri, request, PublishResponse.class).getBody();
        } catch (RestClientException ex) {
            throw new KioskClientException(ex);
        }
    }
}
