package it.epicode.be;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inserisci 3 stringhe: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String stringa1 = scanner.nextLine();
		
		String stringa2 = scanner.nextLine();
		
		String stringa3 = scanner.nextLine();
		
		concatenaStringhe(stringa1,stringa2,stringa3);
			
		scanner.close();
		
	}

	static void concatenaStringhe(String stringa1, String stringa2, String stringa3) {
		// TODO Auto-generated method stub
		System.out.println(stringa1+stringa2+stringa3);
		System.out.println(stringa3+stringa2+stringa1);
	}
	
}
