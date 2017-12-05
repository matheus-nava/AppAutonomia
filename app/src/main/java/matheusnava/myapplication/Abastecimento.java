package matheusnava.myapplication;

<<<<<<< HEAD
import io.realm.RealmObject;
=======
import io.realm.RealmResults;
>>>>>>> 1701cf5ad3496b5dfb35004be47a0a1b57beee0a

/**
 * Created by Matheus Nava on 24/11/2017.
 */

<<<<<<< HEAD
public class Abastecimento extends RealmObject {
=======
public class Abastecimento extends RealmObject{
>>>>>>> 1701cf5ad3496b5dfb35004be47a0a1b57beee0a
    private int quilometragem;
    private float litros;
    private String data;
    private String posto;

    public Abastecimento(){}

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
