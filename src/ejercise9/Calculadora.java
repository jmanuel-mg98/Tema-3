package ejercise9;

public class Calculadora {
	
	public static double calculadora(int num1,int num2,int opcion) {
		double resultado=0;
		if (opcion==1) {
			resultado=num1+num2;
		}else if (opcion==2) {
			resultado=num1-num2;
		}else if (opcion==3) {
			resultado=num1*num2;
		}else if (opcion==4) {
			resultado=num1/num2;
		}
		return (resultado);
	}

}
