package com.homedepot.sa.im.inventorymanagementproductdetails.to.response;

import java.util.List;

public class SkuBasicInfo {

    private String skuStatus;
    private String mamaSku;
    private List<Price> prices;
    private String skuDescription;
    private List<String> skuImageUrls;
    private String unitOfMeasure;
    private String brandName;

    public String getSkuStatus() {
        return skuStatus;
    }

    public void setSkuStatus(String skuStatus) {
        this.skuStatus = skuStatus;
    }

    public String getMamaSku() {
        return mamaSku;
    }

    public void setMamaSku(String mamaSku) {
        this.mamaSku = mamaSku;
    }

    public String getSkuDescription() {
        return skuDescription;
    }

    public void setSkuDescription(String skuDescription) {
        this.skuDescription = skuDescription;
    }

    public List<String> getSkuImageUrls() {
        return skuImageUrls;
    }

    public void setSkuImageUrls(List<String> skuImageUrls) {
        this.skuImageUrls = skuImageUrls;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }
}
