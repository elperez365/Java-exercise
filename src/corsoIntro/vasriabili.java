package corsoIntro;

public class vasriabili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ciao");
		System.out.println("ciaone");
		System.out.print("ciaone \n");
		System.out.print("ciaoneeee ");

		/*
		 * metodo per commentare
		 * su più righe
		 * di codice
		 */

		// commentare su una riga

		int x; // dichiarazione
		x = 45; // assegnazione

		int y = 34; // dich + assegnazione
		String w = "ciao";
		double a = 9.56;

		System.out.println(y);

		y = 100;
		System.out.println(y);

		double temperaturaPersona;
		temperaturaPersona = 39.5;
		System.out.print(temperaturaPersona);
		// PRIMITIVI iniziano con la minuscola
		// booleano
		boolean isOn = false;

		// numeri interi
		byte ilBite = -126; // da -128 a 127
		short loShort = 54; // da -32768 a 32767
		int ilint = 2_000_000_000; // -+ 2miliardi
		long ilLong = 6_514_651_986_834L; // +- 9 quintilioni

		// numeri decimali
		float ilFloat = 5.1234567f; // 6-7 cifre decimali
		double ilDouble = 2.152364847761697; // 15 cire decimali

		char ilChar = 'f'; // un carattere singolo apice
							// anche numero o speciale

		// REFERENCE iniziano con la maiuscola (String)
		// può essere anche creata

		String laStringa = "kjvnjkabvgjkanfvg"; // testo

		// attributi disponibili
		laStringa.toUpperCase();
		System.out.print(laStringa.toUpperCase());
		// gli attributi sono disponibili solo
		// nelle reference
	}

}
