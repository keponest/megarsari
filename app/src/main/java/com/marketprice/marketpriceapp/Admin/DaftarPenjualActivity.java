package com.marketprice.marketpriceapp.Admin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.marketprice.marketpriceapp.Adapter.PenjualAdapter;
import com.marketprice.marketpriceapp.R;
import com.marketprice.marketpriceapp.domain.Penjual;

import java.util.ArrayList;
import java.util.List;

public class DaftarPenjualActivity extends AppCompatActivity {
    private PenjualAdapter penjualAdapter;
    private List<Penjual> listPenjual = new ArrayList<Penjual>();
    RecyclerView recyclerViewPenjual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_penjual);

        recyclerViewPenjual = (RecyclerView) findViewById(R.id.RVPenjual);
        recyclerViewPenjual.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerViewPenjual.setLayoutManager(layoutManager);
        addDummyPenjual();

        penjualAdapter = new PenjualAdapter(listPenjual, recyclerViewPenjual, getApplicationContext());
        recyclerViewPenjual.setAdapter(penjualAdapter);
    }

    private void addDummyPenjual() {
        int j = 1;
        for (int i = 0; i < 10; i++) {
            Penjual data = new Penjual();
            data.setPenjualId(Long.valueOf(j));
            data.setPenjualName("Penjual " + j);
            data.setAlamatPenjual("Alamat Penjual " + j);
            listPenjual.add(data);
            j++;
        }
    }
}
