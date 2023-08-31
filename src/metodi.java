public class metodi {
    public static void main(String[] args) {
        // utilizzo metodo cucina pranzo
        cucinaPranzo("carne");

        // utilizzo metodo addizione in 2 variabili
        int totale = addizione(5, 6);
        int totale2 = addizione(10, 20);

        System.out.println(totale);
        System.out.println(totale2);
    }

    // creazione metodo cucinapranzo
    static void cucinaPranzo(String cibo) {
        System.out.println("sto cucinando " + cibo);
    }

    // creazione metodo addizione
    static int addizione(int a, int b) {
        int risultato = a + b;
        return risultato;
    }
}
