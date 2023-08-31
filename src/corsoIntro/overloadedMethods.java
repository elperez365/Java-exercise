package corsoIntro;

public class overloadedMethods {

    // in java possiamo creare 2 metodi con lo stesso nome
    // però devono avere valori di input differenti
    // questo può essere utile se dobbiamo fare la stessa cosa
    // con tipi o ritorni differenti

    public static void main(String[] args) {
        int doppiopInt = addizione(2, 3);
        int triploInt = addizione(2, 3, 3);
        double doppioDouble = addizione(2.5, 6.3);

        System.out.println(doppiopInt);
        System.out.println(triploInt);
        System.out.println(doppioDouble);
    }

    static int addizione(int a, int b) {
        int risultato = a + b;
        return risultato;
    }

    static int addizione(int a, int b, int c) {
        int risultato = a + b + c;
        return risultato;
    }

    static double addizione(double a, double b) {
        double risultato = a + b;
        return risultato;
    }

}
