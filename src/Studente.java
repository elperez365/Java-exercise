public class Studente extends Persona {
    String materiaPrederita = "storia";
    String classe = "storia";
    int[] votiStoria = { 9, 9, 9 };

    Studente(String nome, String cognome) {
        super(nome, cognome);

    }

    void studia() {
        System.out.println("sto insegnando...");

    }

    @Override
    void saluta() {
        System.out.println("Buongiorno prof");

    }
}
