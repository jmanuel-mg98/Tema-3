package ejercise7;

import java.util.Scanner;

import ejercise4.EsVocal;

public class Main7 {

	public static void main(String[] args) {
		int num;
		boolean res;
		Scanner sc = new Scanner(System.in);
		System.out.print("escribe un numero: ");
		num=sc.nextInt();
		
		res = EsPrimo.esPrimo(num);
		System.out.println(res);

	}

}
