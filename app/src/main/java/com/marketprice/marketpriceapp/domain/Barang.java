package com.marketprice.marketpriceapp.domain;

/**
 * Created by Indra Prasetya on 01/16/2018.
 */

public class Barang {

    private Long barangId;
    private String barangName;
    private Number barangPrice;
    private Number barangValue;

    public Long getBarangId() {
        return barangId;
    }

    public void setBarangId(Long barangId) {
        this.barangId = barangId;
    }

    public String getBarangName() {
        return barangName;
    }

    public void setBarangName(String barangName) {
        this.barangName = barangName;
    }

    public Number getBarangPrice() {
        return barangPrice;
    }

    public void setBarangPrice(Number barangPrice) {
        this.barangPrice = barangPrice;
    }

    public Number getBarangValue() {
        return barangValue;
    }

    public void setBarangValue(Number barangValue) {
        this.barangValue = barangValue;
    }

    @Override
    public String toString() {
        return "Barang{" +
                "barangId='" + barangId + '\'' +
                ", barangName='" + barangName + '\'' +
                ", barangPrice=" + barangPrice +
                ", barangValue=" + barangValue +
                '}';
    }
}
