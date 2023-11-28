package ejercise8;

import java.util.Scanner;

import ejercise7.EsPrimo;

public class Main8 {

	public static void main(String[] args) {
		int num;
		int res;
		Scanner sc = new Scanner(System.in);
		System.out.print("escribe un numero: ");
		num=sc.nextInt();
		res =DivisoresPrimos.divisoresPrimos(num);
		System.out.println(res);

	}

}
