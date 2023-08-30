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

    }
}
