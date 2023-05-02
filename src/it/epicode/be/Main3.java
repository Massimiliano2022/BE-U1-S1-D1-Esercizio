package it.epicode.be;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		
		int b = 20;
		
		int c = 30;
		
		int perimetroRettangolo = calcolaPerimetroRettangolo(a,b);
		
		System.out.println("Perimetro Rettangolo : " + perimetroRettangolo);
		
		int isPari = pariDispari(a);
		
		System.out.println(isPari);
		
		int perimetroTriangolo = calcolaPerimetroTriangolo(a,b,c);
		
		System.out.println("Perimetro Triangolo : " +perimetroTriangolo);
		
		
	}

	static int calcolaPerimetroRettangolo(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}
	
	static int pariDispari(int a) {
		
		if(a%2 == 0) {
			return 0;
		}else {
			return 1;
		}
	}
	
	private static int calcolaPerimetroTriangolo(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

}
