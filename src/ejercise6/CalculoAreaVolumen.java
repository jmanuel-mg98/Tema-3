package ejercise6;

public class CalculoAreaVolumen {
	
	public static void calculoAreaVolumen(int radio,int altura,int opcion) {
		final double PI =Math.PI;
		if (opcion==1) {
			double resultadoArea=2*PI*radio*(altura+radio);
			System.out.println("el area del cilindro es"+resultadoArea+" cm");
		}else if (opcion==2) {
			double resultadoVolumen=PI*Math.pow(radio, 2)*altura;
			System.out.println("el area del cilindro es"+resultadoVolumen+" cm");
		}else {
			System.out.println("opcion no corerecta");
			
			
			
			
			
			
			
		}
	}

}
