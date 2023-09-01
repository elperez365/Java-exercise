
// la clase astratta è una classe che non possiamo 
// utilizzare per creare oggetti però possiamo estenderla

public abstract class Veicolo {
    abstract void muovi();

    // il metodo astratto tipo questo è un metodo dove
    // non specifichiamo cosa fa però deve essere presente
    // nelle classi che estendono questa classe

    abstract void frena();
}
