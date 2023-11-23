package ejercise6;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		int radio,altura,opcion;
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce el radio del cilindro: ");
		radio= sc.nextInt();
		System.out.print("introduce la altura del cilindro: ");
		altura= sc.nextInt();
		System.out.print("si quieres calcular el area pulsa 1 y si quieres calcular el volumen pulsa 2");
		opcion =sc.nextInt();
		CalculoAreaVolumen.calculoAreaVolumen(radio, altura, opcion);
				

	}

}
