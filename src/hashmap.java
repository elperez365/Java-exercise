import java.util.HashMap;

public class hashmap {
    // le Hashmap sono simi agli oggetti di javascript
    public static void main(String[] args) {

        // creare hashmap
        HashMap<String, String> capitali = new HashMap<String, String>();

        // inserire valori (chiave, valore)

        capitali.put("Inghilterra", "Londra");
        capitali.put("Italia", "Roma");
        capitali.put("Germania", "Berlino");
        capitali.put("Francia", "Parigi");

        System.out.println(capitali.get("Italia"));
        System.out.println(capitali);

        // rimuovere un elemento

        capitali.remove("Francia");
        System.out.println(capitali);

        // rimuovere tutto

        capitali.clear();
        System.out.println(capitali);

    }
}
