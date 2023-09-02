public class Casting {
    // il casting è il processo dove andiamo a trasformare
    // il tipo di dato

    public static void main(String[] args) {
        double x = 9;
        // in questo caso 9 è un int e java fa un
        // casting implicito e lo trasforma in
        // double
        System.out.println(x);

        // casting esplicito

        int y = (int) 9.5;

        System.out.println(y);

    }
}
