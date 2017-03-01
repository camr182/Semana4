package com.example.ameza.contactost.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ameza.contactost.adapters.ListaAdapter;
import com.example.ameza.contactost.pojo.Mascota;
import com.example.ameza.contactost.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    RecyclerView recycler;
    RecyclerView.Adapter adaptador;
    RecyclerView.LayoutManager lmanager;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_home, container, false);

        List<Mascota> items = new ArrayList<>();

        items.add(new Mascota(R.drawable.mascota6,"El Maykol","3"));
        items.add(new Mascota(R.drawable.mascota2,"Brandon","8"));
        items.add(new Mascota(R.drawable.mascota1,"Fido","5"));



/*
        items.add(new Mascota(R.drawable.angel,"Angel Beats"));
        items.add(new Mascota(R.drawable.death,"Death Note"));
        items.add(new Mascota(R.drawable.fate,"Fate Stay Night"));
        items.add(new Mascota(R.drawable.nhk,"Welcome to the NHK"));
        items.add(new Mascota(R.drawable.suzumiya,"Suzumiya Haruhi"));
*/
        recycler = (RecyclerView) v.findViewById(R.id.rvLista);
        recycler.setHasFixedSize(true);

        lmanager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(lmanager);

        adaptador = new ListaAdapter(items);
        recycler.setAdapter(adaptador);

        return v;
    }

}
