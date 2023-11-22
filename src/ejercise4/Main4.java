package ejercise4;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		String caracter;
		boolean res;
		Scanner sc = new Scanner(System.in);
		System.out.print("escribe un caracter: ");
		caracter=sc.next();
		
		res = EsVocal.esVocal(caracter);
		System.out.println(res);
	
	}

}
