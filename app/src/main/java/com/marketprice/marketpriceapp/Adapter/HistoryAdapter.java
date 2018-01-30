package com.marketprice.marketpriceapp.Adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.marketprice.marketpriceapp.R;
import com.marketprice.marketpriceapp.domain.History;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by User on 30/01/2018.
 */

public class HistoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    List<History> listHistory;
    RecyclerView recyclerView;

    public HistoryAdapter(Context context, List<History> listHistory, RecyclerView recyclerView) {
        this.context = context;
        this.listHistory = listHistory;
        this.recyclerView = recyclerView;

        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

            }
        });
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_history, parent, false);
        return new DaftarHistory(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        History history = listHistory.get(position);
        DaftarHistory daftarHistory = (DaftarHistory) holder;

        /*daftarHistory.namaHistoryPurchase.setText(history.getNamaBarang());
        daftarHistory.hargaHistoryPurchase.setText(history.getHargaBarang().toString());
        daftarHistory.iconHistoryPurchase.setImageDrawable(context.getResources().getDrawable(R.drawable.logo));*/

        daftarHistory.namaHistoryPurchase.setText("TEST NAMA");
        daftarHistory.hargaHistoryPurchase.setText("TEST HARGA");
        daftarHistory.iconHistoryPurchase.setImageDrawable(context.getResources().getDrawable(R.drawable.logo));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class DaftarHistory extends RecyclerView.ViewHolder {
        public TextView namaHistoryPurchase;
        public TextView hargaHistoryPurchase;
        public ImageView iconHistoryPurchase;

        public DaftarHistory(View itemView) {
            super(itemView);
            namaHistoryPurchase= (TextView) itemView.findViewById(R.id.namaHistoryPurchase);
            hargaHistoryPurchase = (TextView) itemView.findViewById(R.id.hargaHistoryPurchase);
            iconHistoryPurchase = (ImageView) itemView.findViewById(R.id.iconHistoryPurchase);

        }
    }
}
