package corsoIntro;

public class operazioniAritmetiche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 2;
		int z = x + y;

		System.out.println(z);

		x += 3; // x = x + 3;
		x++; // aumenta di 1
		x--; // diminuisce di 1

		// espressioni aritmetiche
		// si fa tutto con le tonde

		// ((3+5)*3+(4-2))*9

		int p = 9;

		int risultato = ((y + x) * y + (4 - 2)) * p;

		System.out.println(risultato);

		// classe math

		System.out.print(Math.abs(-55));
		// risultato 55 (abs toglie il segno)

		System.out.print(Math.min(55, 21));
		// risposta 21

		System.out.print(Math.max(55, 21));
		// risposta 55

		System.out.print(Math.pow(5, 2));
		// risposta 25 (primo numero alla potenza del secondo)

		System.out.print(Math.sqrt(25));
		// risposta 5 (radice quadrata)

		System.out.print(Math.PI);
		// risposta 3.14 (piGreco)

	}

}
