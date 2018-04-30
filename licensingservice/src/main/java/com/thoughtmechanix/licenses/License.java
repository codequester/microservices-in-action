package com.thoughtmechanix.licenses;

class License {
    private String id;
    private String organizationId;
    private String productName;
    private String licenseType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    License withId(String id) {
        this.id = id;
        return this;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setorganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    License withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    License withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    License withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
}
