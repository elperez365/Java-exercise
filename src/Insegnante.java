public class Insegnante extends Persona {
    String materiaInsegnamento = "Matematica";
    String[] classi = { "1D", "2D", "3D" };

    Insegnante(String nome, String cognome) {
        super(nome, cognome);

    }

    void insegna() {
        System.out.println("sto insegnando...");

    }

    @Override
    void saluta() {
        System.out.println("Buongiorno ragazzi");

    }

}
