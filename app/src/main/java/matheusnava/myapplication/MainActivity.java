package matheusnava.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import io.realm.Realm;

public class MainActivity extends AppCompatActivity {
    private TextView kmAtual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
	Realm.init(this);
        setContentView(R.layout.activity_main);

        this.kmAtual = (TextView) findViewById(R.id.txtKmAtual);
        if(Lista.getInstance().getLista().size() != 0) {
            kmAtual.setText(""+calculaAutonomia());
        }
    }

    public void adcAbast(View view){
        Intent i = new Intent(getApplicationContext(), AdcAbastecimento.class);
        startActivityForResult(i, 1);
    }

    public void visualizaAbast(View view){
        Intent i = new Intent(getApplication(), ListaActivity.class);
        startActivity(i);
    }

    public float calculaAutonomia(){
        Abastecimento a = Lista.getLista().get(Lista.getLista().size()-1);
        Abastecimento b = Lista.getLista().get(Lista.getLista().size()-2);
        return (a.getQuilometragem() - b.getQuilometragem()) / a.getLitros();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if (Lista.getInstance().getLista().size() > 1)
                kmAtual.setText(String.format("%.2f", calculaAutonomia()));
        }
    }
}
