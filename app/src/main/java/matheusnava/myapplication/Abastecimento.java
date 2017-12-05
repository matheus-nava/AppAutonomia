package matheusnava.myapplication;

import io.realm.RealmResults;

/**
 * Created by Matheus Nava on 24/11/2017.
 */

public class Abastecimento extends RealmObject{
    private int quilometragem;
    private float litros;
    private String data;
    private String posto;

    Abastecimento (int quilometragem, float litros, String data, String posto){
        this.quilometragem = quilometragem;
        this.litros = litros;
        this.data = data;
        this.posto = posto;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPosto() {
        return posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }
}
