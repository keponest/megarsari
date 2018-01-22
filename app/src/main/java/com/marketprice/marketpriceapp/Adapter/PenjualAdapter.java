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
import com.marketprice.marketpriceapp.domain.Penjual;
import java.util.List;



public class PenjualAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    Context context;
    List<Penjual> listPenjual;
    RecyclerView recyclerView;

    public PenjualAdapter(List<Penjual> listpenjual, RecyclerView recyclerView, Context con) {
        this.listPenjual = listpenjual;
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
        View view = LayoutInflater.from(context).inflate(R.layout.list_penjual, parent, false);
        return new DaftarPenjual(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Penjual penjual = listPenjual.get(position);
        DaftarPenjual daftarPenjual = (DaftarPenjual) holder;


        daftarPenjual.namapenjual.setText(penjual.getPenjualName());
        daftarPenjual.alamatpenjual.setText(penjual.getAlamatPenjual().toString());
        daftarPenjual.gambarPenjual.setImageDrawable(context.getResources().getDrawable(R.drawable.logo));

    }

    @Override
    public int getItemCount() {
        return listPenjual == null ? 0 : listPenjual.size();
    }

    static class DaftarPenjual extends RecyclerView.ViewHolder {
        public TextView namapenjual;
        public TextView alamatpenjual;
        public ImageView gambarPenjual;

        public DaftarPenjual(View itemView) {
            super(itemView);
            namapenjual = (TextView) itemView.findViewById(R.id.namaPenjual);
            alamatpenjual = (TextView) itemView.findViewById(R.id.alamatPenjual);
            gambarPenjual = (ImageView) itemView.findViewById(R.id.iconPenjual);

        }
    }
}
