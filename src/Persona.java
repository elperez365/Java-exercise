public class Persona {
    String nome;
    String cognome;
    int eta;
    String colorePreferito;

    Persona(String nome, String cognome, int eta, String colorePreferito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;

    }

    void saluta() {
        System.out.println("ciao sono" + nome);
    }

    void cammina() {
        System.out.println("sto camminando...");
    }
}
