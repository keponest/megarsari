package com.marketprice.marketpriceapp.domain;

import java.time.LocalDate;

/**
 * Created by User on 30/01/2018.
 */

public class History {
    Long idHistory;
    String namaBarang;
    Number hargaBarang;
    String additionalMessage;
    LocalDate purchaceDate;

    public Long getIdHistory() {
        return idHistory;
    }

    public void setIdHistory(Long idHistory) {
        this.idHistory = idHistory;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public Number getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(Number hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public String getAdditionalMessage() {
        return additionalMessage;
    }

    public void setAdditionalMessage(String additionalMessage) {
        this.additionalMessage = additionalMessage;
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
                ", namaBarang='" + namaBarang + '\'' +
                ", hargaBarang=" + hargaBarang +
                ", additionalMessage='" + additionalMessage + '\'' +
                ", purchaceDate=" + purchaceDate +
                '}';
    }
}
