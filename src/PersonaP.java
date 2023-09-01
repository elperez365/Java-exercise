//con i metodi getter e setter noi possiamo accedere alle 
//variabili private

public class PersonaP {
    private String nome;
    private String cognome;

    PersonaP(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

}
