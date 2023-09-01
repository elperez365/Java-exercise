public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("luca", "rossi", 30, "blu");
        // persona1 adesso è un oggetto di tipo persona

        System.out.println(persona1.colorePreferito);

        persona1.cammina();

        Persona persona2 = new Persona("Anna", "verdi", 51, "verde");

        System.out.println(persona2.eta);
    }
}
