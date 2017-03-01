package com.example.ameza.contactost.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ameza.contactost.R;
import com.example.ameza.contactost.adapters.ListaAdapterDetalleDog;
import com.example.ameza.contactost.pojo.Mascota;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleDogFragment extends Fragment {

    RecyclerView recycler;
    RecyclerView.Adapter adaptador;
    RecyclerView.LayoutManager lmanager;

    public DetalleDogFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View v = inflater.inflate(R.layout.fragment_detalle_dog, container, false);

        List<Mascota> items = new ArrayList<>();

        //items.add(new Mascota(R.drawable.mascota1,"Fido","5", imagen1, imagen2, imagen3, imagen4, imagen5, imagen6));
        //items.add(new Mascota(R.drawable.mascota2,"Brandon","8", imagen1, imagen2, imagen3, imagen4, imagen5, imagen6));
        items.add(new Mascota(R.drawable.mascota6,"El Maykol","3", R.drawable.maykol1, R.drawable.maykol2, R.drawable.maykol3, R.drawable.maykol4, R.drawable.maykol5, R.drawable.maykol6));
        items.add(new Mascota(R.drawable.mascota2,"Brandon","3", R.drawable.brandon1, R.drawable.brandon2, R.drawable.brandon3, R.drawable.brandon4, R.drawable.brandon5, R.drawable.brandon6));


        recycler = (RecyclerView) v.findViewById(R.id.rvDetalleDog);
        recycler.setHasFixedSize(true);

        lmanager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(lmanager);

        adaptador = new ListaAdapterDetalleDog(items);
        recycler.setAdapter(adaptador);

        return v;
    }



}
