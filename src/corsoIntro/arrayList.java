package corsoIntro;

import java.util.ArrayList;

public class arrayList {

    // le arraylist sono array ridimensionabili
    // le araylist non accettano primitive

    public static void main(String[] args) {
        // rispettare i tipi solo con wrapperclasses

        ArrayList<String> persone = new ArrayList<String>();

        persone.add("Luca");
        persone.add("Marco");
        persone.add("Anna");

        System.out.println(persone.get(0));
        // .get(0) ci restituirà il valore alla posizione zero

        for (int i = 0; i < persone.size(); i++) {
            System.out.println(persone.get(i));
        }

        persone.set(2, "Paola");
        // .set prende in input la posizione del valore da cambiare
        // il secondo input è il nuovo valore

        persone.remove(0);
        // . remove prende in input l'index del valore da rimuovere

        persone.clear();
        // .clear svouta l'array e elimina tutti i dati

        // ARRAYLIST 2D

        ArrayList<ArrayList<String>> classi = new ArrayList();

        ArrayList<String> classe1 = new ArrayList<String>();
        classe1.add("Luca");
        classe1.add("Marco");

        ArrayList<String> classe2 = new ArrayList<String>();
        classe2.add("Anna");
        classe2.add("orazio");

        classi.add(classe1);
        classi.add(classe2);

        for (int i = 0; i < classi.size(); i++) {
            System.out.println();
            for (int j = 0; j < classi.get(i).size(); j++) {
                System.out.print(classi.get(i).get(j) + "");

            }
        }

    }
}
