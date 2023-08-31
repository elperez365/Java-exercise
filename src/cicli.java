public class cicli {
    public static void main(String[] args) {

        int i = 0;

        // while
        while (i < 5) {
            System.out.println("while" + i);
            i++;
        }
        // do while
        do {
            System.out.println("dowhile" + i);
            i++;
        } while (i < 5);

        // differenza tra while e do while è che
        // il while verifica la condizione prima di iniziare
        // il do while fa il primo step e poi verifica la condizione

        // for
        for (int index = 0; index < 5; index++) {
            System.out.println("riga" + index);
            for (int col = 0; col < 5; col++) {
                System.out.println("colonna" + col);
                if (col == 4) {
                    break; // si ferma qua
                }
                if (col == 6) {
                    continue; // salta questo step e passa al prossimo
                }
            }
        }

        // enhanced (foreach)
        int[] numeri = { 10, 20, 30, 40, 50 };

        for (int numero : numeri) {
            System.out.println(numero);
        }
    }
}
