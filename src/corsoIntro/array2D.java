package corsoIntro;

public class array2D {
    public static void main(String[] args) {

        // Array 2d = array multidimensionali = array array
        // primo metodo di dichiarazione
        String[][] classi = new String[3][3];

        // secondo metodo di dichiarazione
        String[][] classi2 = {
                { "Luca", "Anna", "Marco" },
                { "Edoardo", "Leonardo", "Antonio" },
                { "Arianna", "Paolo", "Andrea" }
        };

        // entrambi gli array sono identici
        // adesso inseriamo i dati nell'array classi
        classi[0][0] = "Luca";
        classi[0][1] = "Anna";
        classi[0][2] = "Marco";

        classi[1][0] = "Edoardo";
        classi[1][1] = "Leonardo";
        classi[1][2] = "Antonio";

        classi[2][0] = "Arianna";
        classi[2][1] = "Paolo";
        classi[2][2] = "Andrea";

        /*
         * 
         * 
         * classe 0 -> Luca Anna MArco
         * 
         * classe 1 -> Edoardo Leonardo Antonio
         * 
         * classe 2 -> Arianna Paolo Andrea
         * 
         */

        System.out.println(classi[2][1]);

        for (int classe = 0; classe < classi.length; classe++) {
            System.out.println();
            for (int studente = 0; studente < classi[classe].length; studente++) {
                System.out.print(classi[classe][studente] + " ");
            }
        }

        // foreach
        for (String[] classe : classi) {
            System.out.println();
            for (String studente : classe) {
                System.out.print(studente + " ");
            }
        }

    }
}
