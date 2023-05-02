package it.epicode.be;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;

		int b = 20;

		int risultatoMoltiplica = moltiplica(a, b);

		String concatenazione = concatena("ciao", b);

		String arrayStringhe[] = { "stringa1", "stringa2", "stringa3", "stringa4", "stringa5" };

		String newArray[] = inserisciInArray(arrayStringhe, "stringa6");

		System.out.println("MOLTIPLICAZIONE: " + risultatoMoltiplica);

		System.out.println("CONCATENAZIONE: " + concatenazione);

		System.out.println(Arrays.toString(newArray));

	}

	static int moltiplica(int a, int b) {
		return a * b;
	}

	static String concatena(String string, int b) {
		String risultato = string + b;
		return risultato;
	}

	static String[] inserisciInArray(String[] arrayStringhe, String string) {

		int lunghezzaArray = arrayStringhe.length;

		String risultato[] = new String[lunghezzaArray + 1];

		for (int i = 0; i < risultato.length; i++) {

			if (i < 2) {
				risultato[i] = arrayStringhe[i];
			} else if (i == 2) {
				risultato[i] = string;
			} else {
				risultato[i] = arrayStringhe[i - 1];
			}
		}
		return risultato;
	}
}
