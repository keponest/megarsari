package com.marketprice.marketpriceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.marketprice.marketpriceapp.Admin.DaftarBarangGudangActivity;
import com.marketprice.marketpriceapp.Admin.DaftarPenjualActivity;
import com.marketprice.marketpriceapp.Admin.RegistrasiSalesActivity;

public class HomeAdminActivity extends AppCompatActivity {

    TextView DaftarPenjualBtn, DaftaBarangGudangBtn, ReportAdminBtn, RegisSalesBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_admin);

        DaftarPenjualBtn = (TextView)findViewById(R.id.daftarpenjual);
        DaftaBarangGudangBtn = (TextView)findViewById(R.id.baranggudang);
        ReportAdminBtn = (TextView)findViewById(R.id.report);
        RegisSalesBtn = (TextView)findViewById(R.id.regissales);

        DaftarPenjualBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(HomeAdminActivity.this, DaftarPenjualActivity.class);
                startActivity(it);
            }
        });

        DaftaBarangGudangBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(HomeAdminActivity.this, MenuActivity.class);
                startActivity(it);
            }
        });

        ReportAdminBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(HomeAdminActivity.this, ReportActivity.class);
                startActivity(it);
            }
        });

        RegisSalesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(HomeAdminActivity.this, RegistrasiSalesActivity.class);
                startActivity(it);
            }
        });
    }
}
