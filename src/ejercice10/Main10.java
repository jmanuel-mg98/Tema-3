package ejercice10;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		int num1,num2,num3;
		boolean fecha;
		double res;
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce el dia: ");
		num1= sc.nextInt();
		System.out.print("introduce el mes: ");
		num2= sc.nextInt();
		System.out.print("introduce el año: ");
		num3= sc.nextInt();
		fecha=FechaReal.fechaReal(num1, num2, num3);
		System.out.print(fecha);

	}

}
