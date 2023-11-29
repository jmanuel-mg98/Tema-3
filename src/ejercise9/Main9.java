package ejercise9;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		int num1,num2,opcion;
		double res;
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce un numero: ");
		num1= sc.nextInt();
		System.out.print("introduce otro numero: ");
		num2= sc.nextInt();
		System.out.print("pulsa para elegir la funcion: 1 suma, 2 resta,3 multiplica,4 divide");
		opcion =sc.nextInt();
		res=Calculadora.calculadora(num1,num2,opcion);
		System.out.print(res);

	}

}
