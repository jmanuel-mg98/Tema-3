package ejercise5;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce un numero para mostrar su tabla: ");
		num=sc.nextInt();
		TablaMulti.tablaMulti(num);
		
		

	}

}
