package matheusnava.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by Matheus Nava on 26/11/2017.
 */

public class Gaveta extends RecyclerView.ViewHolder {
    private TextView data;
    private TextView km;
    private TextView litros;
    private ImageView posto;

    public Gaveta(View itemView) {
        super(itemView);

        this.data = itemView.findViewById(R.id.txtData);
        this.km = itemView.findViewById(R.id.txtKm);
        this.litros = itemView.findViewById(R.id.txtLitros);
        this.posto = itemView.findViewById(R.id.imgPosto);
    }

    public void engavetamento(Abastecimento a){
        data.setText(String.valueOf(a.getData()));
        km.setText("KM: "+String.valueOf(a.getQuilometragem()));
        litros.setText(String.valueOf(a.getLitros())+" Litros");

        if(a.getPosto().equals("Texaco")){
            posto.setImageResource(R.drawable.texaco);
        }else if(a.getPosto().equals("Petobras")){
            posto.setImageResource(R.drawable.petrobras);
        }else{
            posto.setImageResource(R.drawable.shell);
        }
    }
}
