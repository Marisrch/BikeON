package br.com.etec.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class RecyclerAdapterBikeNova extends RecyclerView.Adapter<RecyclerAdapterBikeNova.ViewHolder> {

    //cirando variaveis globais para representar a lista e o contexto
    private Context context;
    private List<BikeNova> lstBikeNova;

    //criando o construtor
    public RecyclerAdapterBikeNova(Context context, List<BikeNova> lstBikeNova) {
        this.context = context;
        this.lstBikeNova = lstBikeNova;
    }


    @NonNull
    //carrega a janela
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_bikes_novas,parent,false);
        return new ViewHolder(view);
    }

    //ele que modifica os objetos(ex: trocar fotos)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idModeloTituloBikeNova.setText(lstBikeNova.get(position).getTitulo());
        holder.idModeloImagemBikeNova.setImageResource(lstBikeNova.get(position).getImagem());

    }

    //conta quantos itens tem na lista
    @Override
    public int getItemCount() {
        return lstBikeNova.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //criando variavel que ira representar o xml no java
        CardView idModeloBikeNova;
        ImageView idModeloImagemBikeNova;
        TextView idModeloTituloBikeNova;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //apresentando o java para o xml

            idModeloBikeNova = itemView.findViewById(R.id.idModeloBikeNova);
            idModeloImagemBikeNova = itemView.findViewById(R.id.idModeloImagemBikeNova);
            idModeloTituloBikeNova = itemView.findViewById(R.id.idModeloTituloBikeNova);


        }
    }

}
