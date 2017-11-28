package matheusnava.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

/**
 * Created by Matheus Nava on 27/11/2017.
 */

public class ListaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_lista);

        if(Lista.getInstance().getLista().size() > 0){
            RecyclerView layoutLista = (RecyclerView) findViewById(R.id.layoutLista);
            Autonomia adaptador = new Autonomia();
            adaptador.setListaAbast(Lista.getInstance().getLista());
            layoutLista.setLayoutManager(new LinearLayoutManager(this.getApplicationContext()));
            layoutLista.setAdapter(adaptador);
        }else{
            TextView vazia = (TextView) findViewById(R.id.txtListaVazia);
            vazia.setText("Lista Vazia");
        }
    }
}
