public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("luca", "rossi", 30, "blu");
        // persona1 adesso è un oggetto di tipo persona

        System.out.println(persona1.colorePreferito);

        persona1.cammina();

        Persona persona2 = new Persona("Anna", "verdi", 51, "verde");
        Persona persona3 = new Persona("Rita", "galli", 21, "bianco");

        System.out.println(persona2.eta);

        // overloaded constructors

        Pizza pizza1 = new Pizza("integrale", "pomodoro", "mozzarella", "ananas");
        Pizza pizza2 = new Pizza("zerozero", "cipolle");

        System.out.println(pizza1.toString());
        System.out.println(pizza2.toString());
        // System.out.println(pizza1.impasto);
        // System.out.println(pizza2.impasto);

        // array di oggetti
        Persona[] persone = new Persona[3];

        persone[0] = persona1;
        persone[1] = persona2;
        persone[2] = persona3;

        System.out.println(persone[0]);

        // altro metodo per scrivere array di oggetti
        Persona[] persone2 = { persona1, persona2, persona3 };

        System.out.println(persone2[1]);

        // final e static

        final int prova = 5;
        // questa variabile non può essere più modificata

        // static è una variabile o metodo dichiarati nella classe e lavora da sola
        // senza valori di input (vedi numeroPersone in persona)

        Persona.mostraNumPersone();

        Studente studente1 = new Studente("vasco", "rossi", "storia");

    }
}
