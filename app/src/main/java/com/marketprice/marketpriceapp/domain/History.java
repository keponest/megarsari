package com.marketprice.marketpriceapp.domain;

import java.time.LocalDate;

/**
 * Created by User on 30/01/2018.
 */

public class History {
    Long idHistory;
    String namaBarangPurchase;
    Number hargaBarangPurchase;
    String additionalMessagePurchase;
    LocalDate purchaceDate;

    public Long getIdHistory() {
        return idHistory;
    }

    public void setIdHistory(Long idHistory) {
        this.idHistory = idHistory;
    }

    public String getNamaBarangPurchase() {
        return namaBarangPurchase;
    }

    public void setNamaBarangPurchase(String namaBarangPurchase) {
        this.namaBarangPurchase = namaBarangPurchase;
    }

    public Number getHargaBarangPurchase() {
        return hargaBarangPurchase;
    }

    public void setHargaBarangPurchase(Number hargaBarangPurchase) {
        this.hargaBarangPurchase = hargaBarangPurchase;
    }

    public String getAdditionalMessagePurchase() {
        return additionalMessagePurchase;
    }

    public void setAdditionalMessagePurchase(String additionalMessagePurchase) {
        this.additionalMessagePurchase = additionalMessagePurchase;
    }

    public LocalDate getPurchaceDate() {
        return purchaceDate;
    }

    public void setPurchaceDate(LocalDate purchaceDate) {
        this.purchaceDate = purchaceDate;
    }

    @Override
    public String toString() {
        return "History{" +
                "idHistory=" + idHistory +
                ", namaBarangPurchase='" + namaBarangPurchase + '\'' +
                ", hargaBarangPurchase=" + hargaBarangPurchase +
                ", additionalMessagePurchase='" + additionalMessagePurchase + '\'' +
                ", purchaceDate=" + purchaceDate +
                '}';
    }
}
