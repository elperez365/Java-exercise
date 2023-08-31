package corsoIntro;

public class wrapperClasses {
    /*
     * 
     * primitiva --> WrapperClass
     * 
     * boolean --> boolean
     * char --> Character
     * int --> Integer
     * double --> Double
     * 
     * se dichiariamo una variabile con una wrapperClass,
     * abbiamo poi accesso ai metodi con il dot (.),
     * però sono un pò più lente quindi vanno utilizzate se serve.
     * 
     */

    public static void main(String[] args) {

        Boolean vero = true;
        boolean falso = false;

        // la variabile vero ha accesson ai metodi
        // la variabile falso non ha accesso ai metodi

        System.out.println(vero.toString());

        Character carattere = 'a';

        System.out.println(carattere.charValue());

    }
}
