package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		Scanner password = new Scanner(System.in);
		System.out.println("inserisci il tuo nome");
		String name = password.nextLine();
		System.out.println("inserisci il tuo cognome");
		String surname = password.nextLine();
		System.out.println("inserisci il tuo colore preferito");
		String favoritColor = password.nextLine();
		System.out.println("inserisci il tuo giorno di nascita");
		byte dayOfBirth = password.nextByte();
		System.out.println("inserisci il tuo mese di nascita");
		byte mouthOfBirth = password.nextByte();
		System.out.println("inserisci il tuo anno di nascita");
		short yearOfBirth = password.nextShort();
		short sumBirth = (short) (dayOfBirth + mouthOfBirth + yearOfBirth);
		String messagio = ("Ciao " + name + " la tua password e: ");
		String passwordUtente = name+"-"+ surname + "-" + favoritColor + "-" + sumBirth ;
		System.out.println(messagio + passwordUtente);
		
		
		
		
		
				
		
		
		

	}

}
