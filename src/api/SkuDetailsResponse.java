package com.homedepot.sa.im.inventorymanagementproductdetails.to.response;

import java.util.Objects;

public class SkuDetailsResponse {
    private String skuNbr;
    private String storeNbr;
    private SkuBasicInfo skuBasicInfo;
    private ErrorResponse errorResponse;

    public SkuDetailsResponse(){
    }

    public SkuDetailsResponse(String skuNbr, String storeNbr, ErrorResponse errorResponse) {
        this.skuNbr = skuNbr;
        this.storeNbr = storeNbr;
        this.errorResponse = errorResponse;
    }

    public SkuDetailsResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }


    public String getSkuNbr() {
        return skuNbr;
    }

    public void setSkuNbr(String skuNbr) {
        this.skuNbr = skuNbr;
    }

    public String getStoreNbr() {
        return storeNbr;
    }

    public void setStoreNbr(String storeNbr) {
        this.storeNbr = storeNbr;
    }

    public SkuBasicInfo getSkuBasicInfo() {
        return skuBasicInfo;
    }

    public void setSkuBasicInfo(SkuBasicInfo skuBasicInfo) {
        this.skuBasicInfo = skuBasicInfo;
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkuDetailsResponse that = (SkuDetailsResponse) o;
        return Objects.equals(skuNbr, that.skuNbr) &&
                Objects.equals(storeNbr, that.storeNbr) &&
                Objects.equals(skuBasicInfo, that.skuBasicInfo) &&
                Objects.equals(errorResponse, that.errorResponse);
    }

    @Override
    public int hashCode() {

        return Objects.hash(skuNbr, storeNbr, skuBasicInfo, errorResponse);
    }

    @Override
    public String toString() {
        return "SkuDetailsResponse{" +
                "skuNbr='" + skuNbr + '\'' +
                ", storeNbr='" + storeNbr + '\'' +
                ", skuBasicInfo=" + skuBasicInfo +
                ", errorResponse=" + errorResponse +
                '}';
    }
}
