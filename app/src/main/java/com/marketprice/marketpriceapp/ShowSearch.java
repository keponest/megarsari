package com.marketprice.marketpriceapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.marketprice.marketpriceapp.Adapter.SellBarangAdapter;
import com.marketprice.marketpriceapp.domain.Barang;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 23/01/2018.
 */

public class ShowSearch extends AppCompatActivity {

    private SellBarangAdapter sellBarangAdapter;
    private List<Barang> listBarangleft = new ArrayList<Barang>();
    private List<Barang> listBarangright = new ArrayList<Barang>();
    RecyclerView recyclerViewSellBarang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_barang);

        recyclerViewSellBarang = (RecyclerView) findViewById(R.id.RVShowSellBarang);
        recyclerViewSellBarang.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewSellBarang.setLayoutManager(layoutManager);
        addDummyBarang();
        //addoneDummy();

        sellBarangAdapter = new SellBarangAdapter(listBarangleft,listBarangright, recyclerViewSellBarang, getApplicationContext());
        recyclerViewSellBarang.setAdapter(sellBarangAdapter);

        /*recyclerViewSellBarang.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent i = new Intent(getApplicationContext(), DetailBarang.class);
                i.putExtra("barangName", listBarangleft.get(position).getBarangName());
                i.putExtra("barangId", listBarangleft.get(position).getBarangId().toString());
                i.putExtra("barangPrice", listBarangleft.get(position).getBarangPrice().toString());
                i.putExtra("barangValue", listBarangleft.get(position).getBarangValue().toString());
                startActivity(i);
            }
        }));*/
    }

    private void addDummyBarang() {
        int j = 1;
        for (int i = 0; i < 20; i++) {
            Barang data = new Barang();
            data.setBarangId(Long.valueOf(j));
            data.setBarangName("Barang " + j);
            data.setBarangPrice(j * 1000);
            data.setBarangValue(j * 10);
            listBarangleft.add(data);
            listBarangright.add(data);
            Log.v("List Barang", "Ini Masuk data ke " + i);
            j++;
        }
    }

    private void addoneDummy() {
        int j = 1;
        Barang data = new Barang();
        data.setBarangId(Long.valueOf(j));
        data.setBarangName("Barang " + j);
        data.setBarangPrice(j * 1000);
        data.setBarangValue(j * 10);
        listBarangleft.add(data);
        listBarangright.add(data);
        //Log.v("List Barang", "Ini Masuk data ke " + i);
    }
}
