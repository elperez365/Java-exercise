import java.util.ArrayList;
import java.util.Iterator;

public class Iteratore {
    // gli iteratori sono degli oggetti che ci permettono di iterare

    public static void main(String[] args) {
        ArrayList<String> persone = new ArrayList<String>();
        persone.add("Luca");
        persone.add("Marco");
        persone.add("Anna");
        persone.add("Paolo");

        Iterator<String> it = persone.iterator();
        // stampare un elemento dell'arraylist con l'iteratore

        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());

        // stampare tutti gli elementi dell'arraylist

        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        // eliminare un elemento

        while (it.hasNext()) {
            String persona = it.next();
            if (persona == "Anna") {
                it.remove();
            }
        }
        System.out.println(persone);

    }
}
