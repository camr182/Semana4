package com.example.ameza.contactost.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.ameza.contactost.CircleImage.CircularImageView;
import com.example.ameza.contactost.R;
import com.example.ameza.contactost.pojo.Mascota;

import java.util.List;

/**
 * Created by ameza on 28/02/2017.
 */

public class ListaAdapterDetalleDog extends RecyclerView.Adapter<ListaAdapterDetalleDog.ListaViewHolderDetalleDog> {


    private List<Mascota> items;



    public static class ListaViewHolderDetalleDog extends RecyclerView.ViewHolder {

        public ImageView portadaCircle ;
        public TextView nombreDetallePerro;
        public ImageView detalleFoto1;
        public ImageView detalleFoto2;
        public ImageView detalleFoto3;
        public ImageView detalleFoto4;
        public ImageView detalleFoto5;
        public ImageView detalleFoto6;

        public ListaViewHolderDetalleDog(View itemView) {
            super(itemView);


            portadaCircle = (ImageView) itemView.findViewById(R.id.circularImageView);
            nombreDetallePerro = (TextView) itemView.findViewById(R.id.detalle_dog);
            detalleFoto1 = (ImageView) itemView.findViewById(R.id.detalleFoto1);
            detalleFoto2 = (ImageView) itemView.findViewById(R.id.detalleFoto2);
            detalleFoto3 = (ImageView) itemView.findViewById(R.id.detalleFoto3);
            detalleFoto4 = (ImageView) itemView.findViewById(R.id.detalleFoto4);
            detalleFoto5 = (ImageView) itemView.findViewById(R.id.detalleFoto5);
            detalleFoto6 = (ImageView) itemView.findViewById(R.id.detalleFoto6);

        }
    }

    public ListaAdapterDetalleDog(List<Mascota> items) {
        this.items = items;
    }

    @Override
    public ListaViewHolderDetalleDog onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cv_detalle_dog,parent,false);
        return new ListaAdapterDetalleDog.ListaViewHolderDetalleDog(v);

    }

    @Override
    public void onBindViewHolder(ListaViewHolderDetalleDog holder, int position) {

        holder.portadaCircle.setImageResource(items.get(position).getImagen());
        holder.nombreDetallePerro.setText(items.get(position).getTitulo());
        holder.detalleFoto1.setImageResource(items.get(position).getImagen1());
        holder.detalleFoto2.setImageResource(items.get(position).getImagen2());
        holder.detalleFoto3.setImageResource(items.get(position).getImagen3());
        holder.detalleFoto4.setImageResource(items.get(position).getImagen4());
        holder.detalleFoto5.setImageResource(items.get(position).getImagen5());
        holder.detalleFoto6.setImageResource(items.get(position).getImagen6());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
