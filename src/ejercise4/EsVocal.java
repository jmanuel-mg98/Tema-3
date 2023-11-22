package ejercise4;

public class EsVocal {
	
	public static boolean esVocal(String caracter) {
		boolean res=false;
		switch (caracter) {
		case "A","E","I","O","U","a","e","i","o","u"->
		res=true;
		}
		return (res);
		
	}

}
