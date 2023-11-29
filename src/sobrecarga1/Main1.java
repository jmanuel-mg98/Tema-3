package sobrecarga1;

import java.util.Scanner;

import ejercise9.Calculadora;

public class Main1 {

	public static void main(String[] args) {
		int num1,num2,res;
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce un numero: ");
		num1= sc.nextInt();
		System.out.print("introduce otro numero: ");
		num2= sc.nextInt();
		res=Suma.suma(num1,num2);
		System.out.print(res);
	}

}
