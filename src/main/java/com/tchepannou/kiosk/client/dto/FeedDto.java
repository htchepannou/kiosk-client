package com.tchepannou.kiosk.client.dto;

public class FeedDto {
    private long id;
    private String countryCode;
    private String type;
    private String name;
    private String url;
    private WebsiteDto website;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public WebsiteDto getWebsite() {
        return website;
    }

    public void setWebsite(final WebsiteDto website) {
        this.website = website;
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (!(o instanceof WebsiteDto))
            return false;

        final WebsiteDto that = (WebsiteDto) o;

        return getId() == that.getId();

    }

    @Override
    public int hashCode() {
        return (int) (getId() ^ (getId() >>> 32));
    }
}
