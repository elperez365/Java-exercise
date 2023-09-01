public class Persona {
    String nome;
    String cognome;
    int eta;
    String colorePreferito;
    static int numeroPersone;

    Persona(String nome, String cognome, int eta, String colorePreferito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
        numeroPersone++;

    }

    public String toString() {
        return this.nome + "\n" + this.cognome + "\n" + this.eta;
    }

    void saluta(Persona personaDaSalutare) {
        System.out.println("ciao " + personaDaSalutare.nome + "io sono " + this.nome);
    }

    void cammina() {
        System.out.println("sto camminando...");
    }

}
