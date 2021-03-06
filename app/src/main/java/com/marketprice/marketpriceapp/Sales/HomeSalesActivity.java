package com.marketprice.marketpriceapp.Sales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.marketprice.marketpriceapp.MenuActivity;
import com.marketprice.marketpriceapp.R;
import com.marketprice.marketpriceapp.ReportActivity;

public class HomeSalesActivity extends AppCompatActivity {

    TextView InputBarangBtn, DaftarBarangSalesBtn, ReportSalesBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sales);

        InputBarangBtn = (TextView)findViewById(R.id.inputbarang);
        DaftarBarangSalesBtn = (TextView)findViewById(R.id.daftarbarang);
        ReportSalesBtn = (TextView)findViewById(R.id.reportsales);

        InputBarangBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(HomeSalesActivity.this, InputBarangActivity.class);
                startActivity(it);
            }
        });

        DaftarBarangSalesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(HomeSalesActivity.this, MenuActivity.class);
                startActivity(it);
            }
        });

        ReportSalesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(HomeSalesActivity.this, ReportActivity.class);
                startActivity(it);
            }
        });
    }
}
