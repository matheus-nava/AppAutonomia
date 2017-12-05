package matheusnava.myapplication;

import java.util.ArrayList;
import io.realm.Realm;
/**
 * Created by Matheus Nava on 27/11/2017.
 */

public class Lista {
    private static RealmResults <Abastecimento> lista;
    private static Lista single;

    private Lista(){
	Realm realm = Realm.getDefaultInstance();
        this.lista = realm.where(Abastecimento.class).findAll();
    }

    public static synchronized Lista getInstance(){
        if(single == null)
            single = new Lista();
        return single;
    }

    public static void addLista(Abastecimento ab){
        lista.add(a);

	Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        Abastecimento abastc = realm.createObject(Abastecimento.class);
        abastc.setData(ab.getData());
        abastc.setKilometros(ab.getQuilometros());
        abastc.setLitros(ab.getLitros());
        abastc.setPosto(ab.getPosto());
        realm.copyFromRealm(abastc);
        realm.commitTransaction();
    }

    public static RealmResults <Abastecimento> getLista(){
        Realm realm = Realm.getDefaultInstance();
        lista = realm.where(Abastecimento.class).findAll();
        return lista;
    }
}
