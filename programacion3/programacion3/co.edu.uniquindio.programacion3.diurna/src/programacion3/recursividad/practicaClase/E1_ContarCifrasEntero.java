package programacion3.recursividad.practicaClase;

public class E1_ContarCifrasEntero {

	public static void main(String[] args) {
		int numero = 12345;
		int cifras = 0;
		cifras = contarCifrasEntero(numero);
		System.out.println("Numero de cifras = "+cifras);
	}

	private static int contarCifrasEntero(int numero) {
		if(numero < 10){
			return 1;
		}else{			
			return contarCifrasEntero(numero/10)+1; 
		}
	}

}
