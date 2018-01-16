package com.marketprice.marketpriceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.marketprice.marketpriceapp.AdapterVM.BarangVM;
import com.marketprice.marketpriceapp.domain.Barang;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle("Search");

        ListView listDataBarang = (ListView) findViewById(R.id.listbarang);

        List<Barang> databarang = new ArrayList<Barang>();

        for (int i = 0; i < 10; i++) {
            Barang data = new Barang();
            data.setBarangId(Long.valueOf(i));
            data.setBarangName("Air Minum " + i);
            data.setBarangPrice(i * 2000);
            data.setBarangValue(i * 1000);
            databarang.add(data);
        }
        List<String> array= new ArrayList<String>();
        array.add("Some Text");
        array.add("Some Text");
        array.add("Some Text");



        ArrayAdapter<Barang> adapterbarang = new ArrayAdapter<Barang>(this, R.layout., array);

        ArrayAdapter<String> mHistory = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);
        listDataBarang.setAdapter(mHistory);
    }
}
