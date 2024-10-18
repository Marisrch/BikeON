package br.com.etec.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class BikesNovasFragment extends Fragment {

    private List<BikeNova> lstBikeNova;
    RecyclerView idRecBikesNovas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_bikes_novas, container, false);



        idRecBikesNovas = view.findViewById(R.id.idRecBikesNovas);

        //carregando os objetos da lista

        lstBikeNova = new ArrayList<>();
        lstBikeNova.add(new BikeNova("Vintage",R.drawable.vintage));
        lstBikeNova.add(new BikeNova("bike1",R.drawable.bike1));
        lstBikeNova.add(new BikeNova("bike2",R.drawable.bike2));
        lstBikeNova.add(new BikeNova("bike3",R.drawable.bike3));
        lstBikeNova.add(new BikeNova("bike4",R.drawable.bike4));
        lstBikeNova.add(new BikeNova("bike5",R.drawable.bike5));
        lstBikeNova.add(new BikeNova("bike6",R.drawable.bike6));
        lstBikeNova.add(new BikeNova("bike7",R.drawable.bike7));
        lstBikeNova.add(new BikeNova("bike8",R.drawable.bike8));
        lstBikeNova.add(new BikeNova("bike9",R.drawable.bike9));

        return view;
    }
}