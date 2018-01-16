package com.marketprice.marketpriceapp.AdapterVM;

import com.marketprice.marketpriceapp.domain.Barang;

/**
 * Created by Indra Prasetya on 01/16/2018.
 */

public class BarangVM {

    private Long barangId;
    private String barangName;
    private Number barangPrice;
    private Number barangValue;

    public BarangVM(Long barangId, String barangName, Number barangPrice, Number barangValue) {
        this.barangId = barangId;
        this.barangName = barangName;
        this.barangPrice = barangPrice;
        this.barangValue = barangValue;
    }

    public BarangVM() {
    }

    public BarangVM(Barang barang) {
        this.barangId = barang.getBarangId();
        this.barangName = barang.getBarangName();
        this.barangPrice = barang.getBarangPrice();
        this.barangValue = barang.getBarangValue();
    }

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
}
