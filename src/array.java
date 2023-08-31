public class array {
    public static void main(String[] args) {

        // array = collezioni di dati
        int[] numeri = new int[3];

        numeri[0] = 10;
        numeri[1] = 20;
        numeri[2] = 30;

        System.out.println(numeri.length);
        System.out.println(numeri[1]);

        numeri[1] = 100;

        System.out.println(numeri[1]);

        int[] altriNumeri = { 15, 25, 35 };
        System.out.println(altriNumeri[1]);

        // prendere l'ultimo valorE
        System.out.println(numeri[numeri.length - 1]);

        // CICLARE ARRAY
        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]);
        }

        // foreach
        for (int numero : numeri) {
            System.out.println(numero);

        }

    }
}
