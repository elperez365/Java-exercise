import java.util.Scanner;  //input dell'utente da terminale

public class inputUtente {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Qual'è il tuo nome?");
		String nome = scanner.nextLine();
		
		System.out.println("Qual'è il tuo cognome?");
		String cognome = scanner.nextLine();
		
		System.out.println("Qual'è la tua eta'?");
		int eta = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Qual'è la tua citta'?");
		String citta = scanner.nextLine();
		
		System.out.println("ciao " + nome + " " + cognome );
		System.out.println("ciao " + eta + " anni");
		System.out.println("vivi a  " + citta);
	}
}
