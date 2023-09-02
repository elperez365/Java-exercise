import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataOra {
    public static void main(String[] args) {

        // data locale
        LocalDate x = LocalDate.now();

        System.out.println(x);

        // ora locale
        LocalTime y = LocalTime.now();
        System.out.println(y);

        // data e ora
        LocalDateTime z = LocalDateTime.now();
        System.out.println(z);

        // formattare da la data

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // possiamo usare anche gli slash
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // possiamo usare anche gli spazi
        DateTimeFormatter f5 = DateTimeFormatter.ofPattern("dd MM yyyy");
        // in base al pattern scelto la data uscirà di conseguenza
        System.out.println(x.format(f));

        // nome del mese esteso a 3 lettere
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(x.format(f3));

        // mese per intero
        DateTimeFormatter f4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(x.format(f4));

        // nome del giorno a 3 lettere
        DateTimeFormatter f6 = DateTimeFormatter.ofPattern("EEE, dd/MMMM/yyyy");
        System.out.println(x.format(f6));

        // nome del giorno intero
        DateTimeFormatter f7 = DateTimeFormatter.ofPattern("EEEE, dd/MMMM/yyyy");
        System.out.println(x.format(f7));
    }
}
