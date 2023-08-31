package corsoIntro;

public class condizioni {
    public static void main(String[] args) {
        /*
         * IF
         * ELSE
         * ELSE IF
         * IF annidati
         * ternary operator
         * 
         */

        Boolean isOnline = true;

        if (isOnline) {
            System.out.println("è online");
        } else
            System.out.println("non è online");

        // ternary operator
        String x = 3 < 10 ? "ciao" : "buongiorno";

        // Switch

        String n = "luca";

        switch (n) {
            case "luca":
                System.out.println("è luca");
                break;
            case "marco":
                System.out.println("è marco");
                break;
            default:
                System.out.println("non è nessuno dei due");
        }
    }
}
