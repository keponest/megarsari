package com.marketprice.marketpriceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.marketprice.marketpriceapp.Adapter.BarangAdapter;
import com.marketprice.marketpriceapp.AdapterVM.BarangVM;
import com.marketprice.marketpriceapp.domain.Barang;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {


    private BarangAdapter barangAdapter;
    private List<Barang> listBarang = new ArrayList<Barang>();
    RecyclerView recyclerViewBarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerViewBarang = (RecyclerView) findViewById(R.id.RVBarang);
        recyclerViewBarang.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewBarang.setLayoutManager(layoutManager);
        addDummyBarang();

        barangAdapter = new BarangAdapter(listBarang, recyclerViewBarang, getApplicationContext());
        recyclerViewBarang.setAdapter(barangAdapter);

        recyclerViewBarang.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent i = new Intent(getApplicationContext(), DetailBarang.class);
                i.putExtra("barangName",listBarang.get(position).getBarangName());
                i.putExtra("barangId",listBarang.get(position).getBarangId().toString());
                i.putExtra("barangPrice",listBarang.get(position).getBarangPrice().toString());
                i.putExtra("barangValue",listBarang.get(position).getBarangValue().toString());
                startActivity(i);
            }
        }));
    }

    private void addDummyBarang() {
        int j = 1;
        for (int i = 0; i < 20; i++) {
            Barang data = new Barang();
            data.setBarangId(Long.valueOf(j));
            data.setBarangName("Barang " + j);
            data.setBarangPrice(j * 1000);
            data.setBarangValue(j * 10);
            listBarang.add(data);
            Log.v("List Barang", "Ini Masuk data ke " + i);
            j++;
        }
    }


}
