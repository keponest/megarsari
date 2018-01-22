package com.marketprice.marketpriceapp.domain;

//Model Penjual
public class Penjual  {

    private Long penjualId;
    private String penjualName;
    private String tipePenjual;
    private String alamatPenjual;

    public Long getPenjualId() {
        return penjualId;
    }

    public void setPenjualId(Long penjualId) {
        this.penjualId = penjualId;
    }

    public String getPenjualName() {
        return penjualName;
    }

    public void setPenjualName(String penjualName) {
        this.penjualName = penjualName;
    }

    public String getTipePenjual() {
        return tipePenjual;
    }

    public void setTipePenjual(String tipePenjual) {
        this.tipePenjual = tipePenjual;
    }

    public String getAlamatPenjual() {
        return alamatPenjual;
    }

    public void setAlamatPenjual(String alamatPenjual) {
        this.alamatPenjual = alamatPenjual;
    }


    @Override
    public String toString() {
        return "Penjual{" +
                "penjualId='" + penjualId + '\'' +
                ", penjualName='" + penjualName + '\'' +
                ", tipePenjual=" + tipePenjual + '\'' +
                ", alamatPenjual=" + alamatPenjual + '\'' +
                '}';
    }
}
