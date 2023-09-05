package corsoIntro;

/* equals, equalsIgnoreCase, lenght, charAt,
 * indexOf, isEmpty, toUpperCase, toLowerCase
 * trim, replace
 */

public class metodiStringhe {
    public static void main(String[] args) {
        String nome = "Leonardo";

        boolean risultato = nome.equals("Leonardo");
        // se è uguale ci restituisce true

        boolean risultato2 = nome.equalsIgnoreCase("leonardo");
        // se è uguale ingnorando maiuscolee minuscole
        // restituisce un buleano

        Number risultato3 = nome.length();
        // ci restituisce un numero con la lunghezza

        char risultato4 = nome.charAt(6);
        // ci restituisce il carattere a una determinata posizione

        int risultato5 = nome.indexOf("a");
        // ci restituisce l'index(posizione di quel carattere)

        String risultato6 = nome.toUpperCase();
        // ci restituisce la scringa in maiuscolo

        String risultato7 = nome.toLowerCase();
        // ci restituisce la stringa in minuscolo

        boolean risultato8 = nome.isEmpty();
        // se la stringa è vuota ci restituisce true

        String risultato9 = nome.trim();
        // restituisce la stringa senza spazi vuoti(se ci sono)

        String risultato10 = nome.replace("o", "w");
        // sostituisce il carattere indicato nel primo input
        // con il carattere indicato nel secondo input
        // ogni volta che ne incontra uno nella stringa

        String[] risultato11 = nome.split(" ");
        // trasforma la stringa frase in
        // un'array di parole della frase

        System.out.println(risultato);
        System.out.println(risultato2);
        System.out.println(risultato3);
        System.out.println(risultato4);
        System.out.println(risultato5);
        System.out.println(risultato6);
        System.out.println(risultato7);
        System.out.println(risultato8);
        System.out.println(risultato9);
        System.out.println(risultato10);
        System.out.println(risultato11[0]);

    }
}
