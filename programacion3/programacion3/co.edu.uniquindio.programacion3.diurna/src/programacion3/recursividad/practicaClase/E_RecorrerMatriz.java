package programacion3.recursividad.practicaClase;

import java.util.ArrayList;

public class E_RecorrerMatriz {

	public static void main(String[] args) {
		
		int [][] matriz = {{1,2},{2,3}};
		String [][] matrizCadena = {{"hola","como"},{"van","todos"}};
		int mayor = 0;
		int filaMayor = 0;
		ArrayList<String> listaPalabras = new ArrayList<String>();
//		recorrerMaztriz(matriz,0,0);
		recorrerMaztriz(matrizCadena,0,0,listaPalabras);
		//retornarFilaMayor();
	}

	
	
	private static boolean verificarVocalesSeguidas(String palabra, int indice) {
		
	}



	private static void recorrerMaztriz(String[][] matriz, int i, int j, ArrayList<String> listaPalabras) {
		String palabra = "";
		if(i <= matriz.length -1)
		{
			if(j <= matriz[i].length-1){
				palabra = matriz[i][j];
				if(verificarVocalesSeguidas(palabra,0)== true){
					listaPalabras.add(palabra);
				}
				if(j == matriz[i].length-1){
					j=0;
					i++;
					System.out.println();
				}else{
					j++;
				}
				recorrerMaztriz(matriz, i, j,listaPalabras);
			}
		}		
	}
	
	
	private static void recorrerMaztriz(int[][] matriz, int i, int j) {
		if(i <= matriz.length -1)
		{
			if(j <= matriz[i].length-1){
				System.out.print(matriz[i][j]);
				if(j == matriz[i].length-1){
					j=0;
					i++;
					System.out.println();
				}else{
					j++;
				}
				recorrerMaztriz(matriz, i, j);
			}
		}		
	}

	
	
//	private static void recorrerMaztriz(int[][] matriz, int i, int j) {
//		
//		if(i > matriz.length || j <= matriz[i].length-1){
//			System.out.print(matriz[i][j]);
//			if(j == matriz[i].length-1){
//				j=0;
//				i++;
//			}else{
//				j++;
//			}
//			recorrerMaztriz(matriz, i, j);
//		}		
//	}
}
