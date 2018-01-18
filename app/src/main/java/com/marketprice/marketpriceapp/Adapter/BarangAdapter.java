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
import com.marketprice.marketpriceapp.domain.Barang;

import java.math.BigDecimal;
import java.util.List;


public class BarangAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    List<Barang> listBarang;
    RecyclerView recyclerView;

    public BarangAdapter(List<Barang> listbarang, RecyclerView recyclerView, Context con) {
        this.listBarang = listbarang;
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

        View view = LayoutInflater.from(context).inflate(R.layout.list_barang, parent, false);
        return new DaftarBarang(view);

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Barang barang = listBarang.get(position);
        DaftarBarang daftarBarang = (DaftarBarang) holder;


        daftarBarang.namabarang.setText(barang.getBarangName());
        daftarBarang.hargabarang.setText(barang.getBarangPrice().toString());
        daftarBarang.gambarBarang.setImageDrawable(context.getResources().getDrawable(R.drawable.logo));
    }

    @Override
    public int getItemCount() {
        return listBarang == null ? 0 : listBarang.size();
    }

    static class DaftarBarang extends RecyclerView.ViewHolder {
        public TextView namabarang;
        public TextView hargabarang;
        public ImageView gambarBarang;

        public DaftarBarang(View itemView) {
            super(itemView);
            namabarang = (TextView) itemView.findViewById(R.id.namaBarang);
            hargabarang = (TextView) itemView.findViewById(R.id.hargaBarang);
            gambarBarang = (ImageView) itemView.findViewById(R.id.iconBarang);

        }
    }


}
