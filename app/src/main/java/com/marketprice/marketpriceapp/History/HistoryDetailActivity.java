package com.marketprice.marketpriceapp.History;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.marketprice.marketpriceapp.R;

public class HistoryDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_detail);
        Bundle extras = getIntent().getExtras();

        TextView showdetil = (TextView) findViewById(R.id.testViewHistory);
        String namabarangPurchase;
        String hargabarangPurchase;

        namabarangPurchase = extras.getString("namabarangPurchase");
        hargabarangPurchase = extras.getString("hargabarangPurchase");

        showdetil.setText("Nama barang: " + namabarangPurchase + "\n" + "Harga Barang: " + hargabarangPurchase);
    }
}
