package com.example.ameza.contactost.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ameza.contactost.pojo.Mascota;
import com.example.ameza.contactost.R;

import java.util.List;

/**
 * Created by ameza on 21/02/2017.
 */

public class ListaAdapter extends RecyclerView.Adapter<ListaAdapter.ListaViewHolder> {


    private List<Mascota> items;

    public static class ListaViewHolder extends RecyclerView.ViewHolder {

        public ImageView imagen;
        public TextView titulo;
        public TextView rating;

        public ListaViewHolder(View itemView) {
            super(itemView);

            imagen = (ImageView) itemView.findViewById(R.id.ivFoto);
            titulo = (TextView) itemView.findViewById(R.id.txtdescripción);
            rating = (TextView) itemView.findViewById(R.id.tvRating);

        }
    }

    public ListaAdapter(List<Mascota> items) {
        this.items = items;
    }

    @Override
    public ListaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        return new ListaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ListaViewHolder holder, int position) {

        holder.imagen.setImageResource(items.get(position).getImagen());
        holder.titulo.setText(items.get(position).getTitulo());
        holder.rating.setText(items.get(position).getRating());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
