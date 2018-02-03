package com.marketprice.marketpriceapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.marketprice.marketpriceapp.History.HistoryDetailActivity;
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

    public HistoryAdapter(List<History> listHistory, RecyclerView recyclerView, Context con) {
        this.listHistory= listHistory;
        this.recyclerView = recyclerView;
        this.context = con;
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
        History history= listHistory.get(position);
        final DaftarHistory daftarHistory = (DaftarHistory) holder;


        daftarHistory.namabarangPurchase.setText(history.getNamaBarangPurchase());
        daftarHistory.hargabarangPurchase.setText(history.getHargaBarangPurchase().toString());
        daftarHistory.gambarBarangPurchase.setImageDrawable(context.getResources().getDrawable(R.drawable.logo));

        daftarHistory.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namabarangPurchase = daftarHistory.namabarangPurchase.getText().toString();
                String hargabarangPurchase = daftarHistory.hargabarangPurchase.getText().toString();
                ImageView gambarBarangPurchase = daftarHistory.gambarBarangPurchase;
                Context context = view.getContext();
                Intent i = new Intent(context, HistoryDetailActivity.class);

                i.putExtra("namabarangPurchase", namabarangPurchase);
                i.putExtra("hargabarangPurchase", hargabarangPurchase);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return listHistory == null ? 0 : listHistory.size();
    }

    static class DaftarHistory extends RecyclerView.ViewHolder {
        public CardView cardView;
        public TextView namabarangPurchase;
        public TextView hargabarangPurchase;
        public ImageView gambarBarangPurchase;

        public DaftarHistory(View itemView) {
            super(itemView);
            namabarangPurchase = (TextView) itemView.findViewById(R.id.namaHistoryPurchase);
            hargabarangPurchase = (TextView) itemView.findViewById(R.id.hargaHistoryPurchase);
            gambarBarangPurchase = (ImageView) itemView.findViewById(R.id.iconHistoryPurchase);
            cardView = (CardView) itemView.findViewById(R.id.cardViewHistory);

        }
    }


}
