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
import android.widget.Toast;

import com.marketprice.marketpriceapp.DetailBarang;
import com.marketprice.marketpriceapp.R;
import com.marketprice.marketpriceapp.domain.Barang;

import java.math.BigDecimal;
import java.util.List;


public class SellBarangAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    List<Barang> listBarangleft;
    List<Barang> listBarangright;
    RecyclerView recyclerView;

    public SellBarangAdapter(List<Barang> listBarangleft, List<Barang> listBarangright,RecyclerView recyclerView, Context con) {
        this.listBarangleft = listBarangleft;
        this.listBarangright = listBarangright;
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

        View view = LayoutInflater.from(context).inflate(R.layout.list_sell_barang, parent, false);
        return new SellDaftarBarang(view);

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        Barang barang = listBarangleft.get(position);
        Barang barang2 = listBarangright.get(position);
        final SellDaftarBarang selldaftarBarang = (SellDaftarBarang) holder;


        selldaftarBarang.namabarang.setText(barang.getBarangName());
        selldaftarBarang.hargabarang.setText(barang.getBarangPrice().toString());
        selldaftarBarang.gambarBarang.setImageDrawable(context.getResources().getDrawable(R.drawable.logo));

        selldaftarBarang.namabarangkanan.setText("r "+ barang2.getBarangName());
        selldaftarBarang.hargabarangkanan.setText(barang2.getBarangPrice().toString());
        selldaftarBarang.gambarBarangkanan.setImageDrawable(context.getResources().getDrawable(R.drawable.logo));

        selldaftarBarang.cardViewkiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "kiri "+selldaftarBarang.namabarang.getText(), Toast.LENGTH_SHORT).show();
                final Context context = view.getContext();
                Intent i = new Intent(context, DetailBarang.class);

                i.putExtra("barangName", selldaftarBarang.namabarang.getText());
                i.putExtra("barangId", "belumdisetidnya");
                i.putExtra("barangPrice", selldaftarBarang.hargabarang.getText());
                i.putExtra("barangValue", "belumdisetjugabro");


                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });

        selldaftarBarang.cardViewkanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "kanan " + selldaftarBarang.namabarangkanan.getText(), Toast.LENGTH_SHORT).show();
                final Context context = view.getContext();
                Intent i = new Intent(context, DetailBarang.class);
                i.putExtra("barangName", selldaftarBarang.namabarangkanan.getText());
                i.putExtra("barangId", "kananblmdiset");
                i.putExtra("barangPrice", selldaftarBarang.hargabarangkanan.getText());
                i.putExtra("barangValue", "belumdisetjugabro");
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBarangleft == null ? 0 : listBarangleft.size();
    }

    static class SellDaftarBarang extends RecyclerView.ViewHolder {
        public TextView namabarang;
        public TextView hargabarang;
        public ImageView gambarBarang;
        public CardView cardViewkiri;

        public TextView namabarangkanan;
        public TextView hargabarangkanan;
        public ImageView gambarBarangkanan;
        public CardView cardViewkanan;

        public SellDaftarBarang(View itemView) {
            super(itemView);
            namabarang = (TextView) itemView.findViewById(R.id.namaBarangleft);
            hargabarang = (TextView) itemView.findViewById(R.id.hargaBarangleft);
            gambarBarang = (ImageView) itemView.findViewById(R.id.iconBarangleft);
            cardViewkiri = (CardView) itemView.findViewById(R.id.cardleft);

            namabarangkanan = (TextView) itemView.findViewById(R.id.namaBarangright);
            hargabarangkanan = (TextView) itemView.findViewById(R.id.hargaBarangright);
            gambarBarangkanan = (ImageView) itemView.findViewById(R.id.iconBarangright);
            cardViewkanan = (CardView) itemView.findViewById(R.id.cardright);
        }
    }


}
