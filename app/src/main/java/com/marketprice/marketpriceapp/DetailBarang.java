package com.marketprice.marketpriceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailBarang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_barang);
        Bundle extras = getIntent().getExtras();

        TextView showdetil = (TextView) findViewById(R.id.showDetil);
        String id;
        String nama;
        String harga;
        String jumlah;

        id = extras.getString("barangId");
        nama = extras.getString("barangName");
        harga = extras.getString("barangPrice");
        jumlah = extras.getString("barangValue");

        showdetil.setText(id + " " + nama + " " + harga + " " + jumlah);
    }
}
