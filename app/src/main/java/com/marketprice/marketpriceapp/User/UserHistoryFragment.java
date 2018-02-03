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

    public UserHistoryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_history, container, false);

        recyclerViewHistory = (RecyclerView) view.findViewById(R.id.RVHistoryPurchase);
        recyclerViewHistory.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerViewHistory.setLayoutManager(layoutManager);
        addDummyHistory();

        historyAdapter = new HistoryAdapter(listhistory, recyclerViewHistory, getContext());
        recyclerViewHistory.setAdapter(historyAdapter);
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
}
