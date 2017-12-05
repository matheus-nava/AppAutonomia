package matheusnava.myapplication;

import java.util.ArrayList;
import io.realm.Realm;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Matheus Nava on 24/11/2017.
 */

public class Autonomia extends RecyclerView.Adapter{
    private RealmResults<Abastecimento> lista;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_abastecimentos, parent, false);
        Gaveta gaveta = new Gaveta(layoutView);
        return gaveta;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Gaveta gaveta = (Gaveta) holder;
        Abastecimento atual = this.getListaAbast().get(position);
        gaveta.engavetamento(atual);
    }

    @Override
    public int getItemCount() {
        return this.getListaAbast().size();
    }

    public void setListaAbast(RealmResults<Abastecimento> lista) {
        this.lista = lista;
    }
}

