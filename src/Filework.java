import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.IIOException;

public class Filework {

    public static void main(String[] args) {
        // agganciare un file nel progetto
        File file = new File("prova.txt");
        if (file.exists()) {
            System.out.println("il file esiste");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // file.delete();
        } else {
            System.out.println("il file non esiste");
        }

        // agganciare un file sul desktop C:\Users\vasco\Desktop
        File file2 = new File("C:\\Users\\vasco\\Desktop\\backtick.txt");
        if (file2.exists()) {
            System.out.println("il file esiste");
        } else {
            System.out.println("il file non esiste");
        }

        // scrivere su file
        try (
                FileWriter writer = new FileWriter("prova.txt")) {
            writer.write("Ciao sono Edoardo \nSto facendo il corso di java");
            writer.append("\nBellissimo file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

        try (FileReader reader = new FileReader("prova.txt")) {
            int data = reader.read();

            // legger un file con il while
            // per farlo scrivere al terminale
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }

            System.out.println(data);

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
