package org.generation.italy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Scrivere un programma per gestire i “Buoni propositi per il futuro”: il
		 * programma all’avvio visualizza 5 “buoni propositi” (es: “fare più attività
		 * fisica”, “esercitarsi sulla OOP”, ecc.). Si chiede all’utente di indicare
		 * quale dei propositi visualizzati è stato conseguito, e viene riproposto
		 * l’elenco solo con quelli non ancora conseguiti. Si continua a chiedere
		 * all’utente fino a quando tutti i propositi saranno conseguiti.
		 */

		/*
		 * PRIMA PROVA
		 * 
		 * 
		 * LinkedHashMap<String, String> propositi = new LinkedHashMap<String,
		 * String>(); Scanner sc=new Scanner (System.in); String
		 * risposta,rispostaRestart; boolean sceltaSbagliata=false;
		 * 
		 * //inserimento Propositi propositi.put("01", "Mangiare sano");
		 * propositi.put("02", "Allenarsi in modo costante"); propositi.put("03",
		 * "Imparare una nuova lingua"); propositi.put("04",
		 * "Esercitarsi con il codice"); propositi.put("05",
		 * "Passare del tempo in famiglia ");
		 * 
		 * 
		 * System.out.println("Buoni propositi per il futuro");
		 * 
		 * 
		 * // scelta del proposito rispettato do { do { if (!propositi.isEmpty())
		 * sceltaSbagliata = false; System.out.
		 * println("Quale proposito hai rispettato quest'anno?  \n1. Mangiare sano \n2. Allenarsi in modo costante \n3. Imparare una nuova lingua \n4. Esercitarsi con il codice \n5. Passare il tempo in famiglia."
		 * ); risposta = sc.nextLine();
		 * 
		 * if (risposta.equals("1")) {
		 * System.out.println("Complimenti, continua a mangiare sano!"); risposta =
		 * sc.nextLine(); } else if (risposta.equals("2")) {
		 * System.out.println("Complimenti, continua ad allenarti!"); risposta =
		 * sc.nextLine(); } else if (risposta.equals("3")) {
		 * System.out.println("Complimenti, hai imparato una nuova lingua!"); risposta =
		 * sc.nextLine(); } else if (risposta.equals("4")) { System.out.
		 * println("Complimenti, stai facendo dei passi avanti con il codice!");
		 * risposta = sc.nextLine(); } else if (risposta.equals("5")) {
		 * System.out.println("Complimenti, continua a passare il tempo in famiglia!");
		 * risposta = sc.nextLine();
		 * 
		 * } else { System.out.println("Scelta errata, inserire nuovamente");
		 * sceltaSbagliata = true; } } while (sceltaSbagliata == true);
		 * 
		 * System.out.
		 * println("Quale proposito hai rispettato quest'anno?  \n1. Mangiare sano \n2. Allenarsi in modo costante \n3. Imparare una nuova lingua \n4. Esercitarsi con il codice \n5. Passare il tempo in famiglia."
		 * ); rispostaRestart=sc.nextLine(); } while
		 * (rispostaRestart.equalsIgnoreCase("si"));
		 * 
		 * L'HO LASCIATO COME PRIMA PROVA DEL MIO FALLIMENTO...
		 */

		// INIZIALIZZAZIONE PROPOSITI

		ArrayList<String> propositi = new ArrayList<>();
		propositi.add("Fare più attività fisica");
		propositi.add("Allenarsi in modo costante");
		propositi.add("Imparare una nuova lingua");
		propositi.add("Esercitarsi con il codice");
		propositi.add("Passare del tempo in famiglia");

		Scanner sc = new Scanner(System.in);

		while (!propositi.isEmpty()) {

			// VISUALIZZAZIONE DEI PROPOSITI
			System.out.println("Ecco i tuoi buoni propositi per il futuro:");
			for (int i = 0; i < propositi.size(); i++) {
				System.out.println((i + 1) + ". " + propositi.get(i));
			}
			
			// SCELTA DEL PROPOSITO DALL'UTENTE
			System.out.print("Quale proposito hai rispettato quest'anno? ");
			int scelta = sc.nextInt();

			// RIMOZIONE DALLA LISTA
			if (scelta > 0 && scelta <= propositi.size()) {
				propositi.remove(scelta - 1);
				System.out.println("Ben fatto! Hai raggiunto uno dei tuoi obiettivi.");
			} else {
				System.out.println("Scelta non valida. Riprova.");
			}
			System.out.println();
		}

		System.out.println("Congratulazioni! Hai eseguito tutti i tuoi buoni propositi.");
		sc.close();
	}

}
