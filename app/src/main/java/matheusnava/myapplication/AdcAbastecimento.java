package matheusnava.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Usuário on 27/11/2017.
 */

public class AdcAbastecimento extends AppCompatActivity {
    private EditText editKm;
    private EditText editLitros;
    private EditText editData;
    private Spinner spinnerPosto;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adc_abastecimento);

        this.editKm = (EditText) findViewById(R.id.editKm);
        this.editData = (EditText) findViewById(R.id.editData);
        this.editLitros = (EditText) findViewById(R.id.editLitros);
        this.spinnerPosto = (Spinner) findViewById(R.id.spinnerPosto);

        final String[] postos =  new String[]{"Texaco", "Petobras", "Shell"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, postos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPosto.setAdapter(adapter);
    }

    public void Adicionar(View view) throws ParseException {
        if(editData.getText().equals("") || editKm.getText().equals("") || editLitros.getText().equals("")) {
            Toast.makeText(getApplicationContext(), "Campos Insuficiente", Toast.LENGTH_SHORT).show();
        }else {
            try {
                DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                Date data = format.parse(editData.getText().toString());
                Abastecimento a = new Abastecimento(Integer.parseInt(editKm.getText().toString()),
                        Float.parseFloat(editLitros.getText().toString()),
                        data.getDate() + "/" + (data.getMonth() + 1) + "/" + (1900 + data.getYear()),
                        spinnerPosto.getSelectedItem().toString());
                if(Lista.getInstance().getLista().size() > 0) {
                    if (a.getQuilometragem() > Lista.getLista().get(Lista.getLista().size() - 1).getQuilometragem()) {
                        Lista.getInstance().addLista(a);
                        finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "Quilometragem Invalida!!!", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Lista.getInstance().addLista(a);
                    finish();
                }
            }catch (ParseException e){
                Toast.makeText(getApplicationContext(), "Data Invalida!!!", Toast.LENGTH_SHORT).show();
            }catch(Exception f){
                Toast.makeText(getApplicationContext(), "I DONT KNOW WHAT HAPPENED!!!", Toast.LENGTH_LONG).show();
                finish();
            }
        }
    }
}
