public class Studente extends Persona {
    String materiaPreferita;
    String classe = "storia";
    int[] votiStoria = { 9, 9, 9 };

    Studente(String nome, String cognome, String materiaPreferita) {
        super(nome, cognome);
        this.materiaPreferita = materiaPreferita;

    }

    void studia() {
        System.out.println("sto insegnando...");

    }

    @Override
    void saluta() {
        System.out.println("Buongiorno prof");

    }
}
