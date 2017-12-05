package matheusnava.myapplication;

import java.util.ArrayList;
<<<<<<< HEAD

import io.realm.Realm;
import io.realm.RealmResults;

=======
import io.realm.Realm;
>>>>>>> 1701cf5ad3496b5dfb35004be47a0a1b57beee0a
/**
 * Created by Matheus Nava on 27/11/2017.
 */

public class Lista {
<<<<<<< HEAD
    private static RealmResults<Abastecimento> lista;
    private static Lista single;

    private Lista(){

        //this.lista = new ArrayList<>();
=======
    private static RealmResults <Abastecimento> lista;
    private static Lista single;

    private Lista(){
	Realm realm = Realm.getDefaultInstance();
        this.lista = realm.where(Abastecimento.class).findAll();
>>>>>>> 1701cf5ad3496b5dfb35004be47a0a1b57beee0a
    }

    public static synchronized Lista getInstance(){
        if(single == null)
            single = new Lista();
        return single;
    }

    public static void addLista(Abastecimento ab){
<<<<<<< HEAD

        //lista.add(a);
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        Abastecimento abastc = realm.createObject(Abastecimento.class);
        abastc.setData(ab.getData());
        abastc.setQuilometragem(ab.getQuilometragem());
=======
        lista.add(a);

	Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        Abastecimento abastc = realm.createObject(Abastecimento.class);
        abastc.setData(ab.getData());
        abastc.setKilometros(ab.getQuilometros());
>>>>>>> 1701cf5ad3496b5dfb35004be47a0a1b57beee0a
        abastc.setLitros(ab.getLitros());
        abastc.setPosto(ab.getPosto());
        realm.copyFromRealm(abastc);
        realm.commitTransaction();
    }

<<<<<<< HEAD
    public static RealmResults<Abastecimento> getLista(){
=======
    public static RealmResults <Abastecimento> getLista(){
>>>>>>> 1701cf5ad3496b5dfb35004be47a0a1b57beee0a
        Realm realm = Realm.getDefaultInstance();
        lista = realm.where(Abastecimento.class).findAll();
        return lista;
    }
}
