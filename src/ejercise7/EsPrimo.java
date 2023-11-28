package ejercise7;

public class EsPrimo {
	
	public static boolean esPrimo(int num) {
		boolean res=true;
		for (int i = 2; i<=Math.sqrt(num); i++) {
			if(num % i == 0) {					
				res = false;
			}
		}
		return (res);
	}

}
