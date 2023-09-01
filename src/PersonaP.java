//con i metodi getter e setter noi possiamo accedere alle 
//variabili private

public class PersonaP {
    private String nome;
    private String cognome;

    PersonaP(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    // copiare un oggetto tramite costruttore
    PersonaP(PersonaP personap) {
        this.copy(personap);
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

    // metodo copy
    // permette di prendere dei dati da un'altro oggetto
    public void copy(PersonaP personap) {
        this.setNome(personap.getNome());
        this.setCognome(personap.getCognome());
    }

}
