package matheusnava.myapplication;

import java.util.ArrayList;

/**
 * Created by Matheus Nava on 27/11/2017.
 */

public class Lista {
    private static ArrayList<Abastecimento> lista;
    private static Lista single;

    private Lista(){
        this.lista = new ArrayList<>();
    }

    public static synchronized Lista getInstance(){
        if(single == null)
            single = new Lista();
        return single;
    }

    public static void addLista(Abastecimento a){
        lista.add(a);
    }

    public static ArrayList<Abastecimento> getLista(){
        return lista;
    }
}
