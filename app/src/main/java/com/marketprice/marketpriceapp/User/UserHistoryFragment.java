package com.marketprice.marketpriceapp.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marketprice.marketpriceapp.Adapter.BarangAdapter;
import com.marketprice.marketpriceapp.Adapter.HistoryAdapter;
import com.marketprice.marketpriceapp.History.HistoryDetailActivity;
import com.marketprice.marketpriceapp.R;
import com.marketprice.marketpriceapp.RecyclerItemClickListener;
import com.marketprice.marketpriceapp.domain.Barang;
import com.marketprice.marketpriceapp.domain.History;

import java.util.ArrayList;
import java.util.List;

public class UserHistoryFragment extends Fragment {

    private HistoryAdapter historyAdapter;
    private List<History> listhistory = new ArrayList<History>();
    RecyclerView recyclerViewHistory;

    private BarangAdapter barangAdapter;
<<<<<<< HEAD
<<<<<<< HEAD
    private List<Barang> listBarang = new ArrayList<Barang>();
=======
    private List<Barang> listbarang = new ArrayList<Barang>();
>>>>>>> c3c3ac9bd2aeabc0f6b4cc43069aaf2eb865cbb3
=======
    private List<Barang> listbarang = new ArrayList<Barang>();
>>>>>>> c3c3ac9bd2aeabc0f6b4cc43069aaf2eb865cbb3
    RecyclerView recyclerViewBarang;

    public UserHistoryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
<<<<<<< HEAD
<<<<<<< HEAD

//        View view = inflater.inflate(R.layout.fragment_user_history, container, false);
        View view = inflater.inflate(R.layout.activity_menu, container, false);

        /*recyclerViewHistory = (RecyclerView) view.findViewById(R.id.RVBarang);
=======
        /*View view = inflater.inflate(R.layout.fragment_user_history, container, false);

        recyclerViewHistory = (RecyclerView) view.findViewById(R.id.RVHistoryPurchase);
>>>>>>> c3c3ac9bd2aeabc0f6b4cc43069aaf2eb865cbb3
=======
        /*View view = inflater.inflate(R.layout.fragment_user_history, container, false);

        recyclerViewHistory = (RecyclerView) view.findViewById(R.id.RVHistoryPurchase);
>>>>>>> c3c3ac9bd2aeabc0f6b4cc43069aaf2eb865cbb3
        recyclerViewHistory.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerViewHistory.setLayoutManager(layoutManager);
        addDummyHistory();

<<<<<<< HEAD
<<<<<<< HEAD
        historyAdapter = new HistoryAdapter(getContext(), listhistory, recyclerViewHistory);
        recyclerViewHistory.setAdapter(historyAdapter);*/

        recyclerViewBarang = (RecyclerView) view.findViewById(R.id.RVBarang);
        recyclerViewBarang.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerViewBarang.setLayoutManager(layoutManager);
        addDummyBarang();

        barangAdapter = new BarangAdapter(listBarang, recyclerViewBarang, getContext());
        recyclerViewBarang.setAdapter(barangAdapter);

        /*recyclerViewHistory.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {
=======
=======
>>>>>>> c3c3ac9bd2aeabc0f6b4cc43069aaf2eb865cbb3
        historyAdapter = new HistoryAdapter(listhistory, recyclerViewHistory, view.getContext());
        recyclerViewHistory.setAdapter(historyAdapter);
        recyclerViewHistory.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {
>>>>>>> c3c3ac9bd2aeabc0f6b4cc43069aaf2eb865cbb3
            @Override
            public void onItemClick(View view, int position) {
                Intent i = new Intent(view.getContext(), HistoryDetailActivity.class);
                i.putExtra("historyName", listhistory.get(position).getHargaBarangPurchase());
                i.putExtra("historyId", listhistory.get(position).getIdHistory().toString());
                i.putExtra("historyPrice", listhistory.get(position).getHargaBarangPurchase().toString());
                i.putExtra("historyDesc", listhistory.get(position).getAdditionalMessagePurchase().toString());
                startActivity(i);
            }
        }));*/
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> c3c3ac9bd2aeabc0f6b4cc43069aaf2eb865cbb3

        View view = inflater.inflate(R.layout.fragment_user_history, container, false);

        recyclerViewHistory= (RecyclerView) view.findViewById(R.id.RVHistoryPurchase);
        recyclerViewHistory.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerViewHistory.setLayoutManager(layoutManager);
        addDummyHistory();

        historyAdapter = new HistoryAdapter(listhistory, recyclerViewHistory, getContext());
        recyclerViewHistory.setAdapter(historyAdapter);

<<<<<<< HEAD
>>>>>>> c3c3ac9bd2aeabc0f6b4cc43069aaf2eb865cbb3
=======
>>>>>>> c3c3ac9bd2aeabc0f6b4cc43069aaf2eb865cbb3

        return view;


    }

    private void addDummyHistory() {
        int j = 1;
        for (int i = 0; i < 20; i++) {
            History data = new History();
            data.setIdHistory(Long.valueOf(j));
            data.setNamaBarangPurchase("Purchase Barang " + j);
            data.setHargaBarangPurchase(j * 1000);
            data.setAdditionalMessagePurchase("this is history message");
            data.setPurchaceDate(null);
            listhistory.add(data);
            Log.v("List History", "Ini Masuk data ke " + i);
            j++;
        }
    }

    private void addDummyBarang() {
        int j = 1;
        for (int i = 0; i < 20; i++) {
            Barang data = new Barang();
            data.setBarangId(Long.valueOf(j));
            data.setBarangName("Barang " + j);
            data.setBarangPrice(j * 1000);
            data.setBarangValue(j * 10);
<<<<<<< HEAD
<<<<<<< HEAD
            listBarang.add(data);
=======
            listbarang.add(data);
>>>>>>> c3c3ac9bd2aeabc0f6b4cc43069aaf2eb865cbb3
=======
            listbarang.add(data);
>>>>>>> c3c3ac9bd2aeabc0f6b4cc43069aaf2eb865cbb3
            Log.v("List Barang", "Ini Masuk data ke " + i);
            j++;
        }
    }
}
