package ejercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce un numero: ");
		num1= sc.nextInt();
		System.out.print("introduce otro numero: ");
		num2= sc.nextInt();
		CuentaNum.cuentaNum(num1, num2);

	}

}
