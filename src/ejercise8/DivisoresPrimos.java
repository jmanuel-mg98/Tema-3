package ejercise8;

import ejercise7.EsPrimo;

public class DivisoresPrimos {
	

	public static int divisoresPrimos(int num) {
		int res=0;
		for(int j=2;j<=Math.sqrt(num);j++) {
			if(EsPrimo.esPrimo(j) && num%j==0){
			res++;
			}
		}
		return (res);
	}
}
