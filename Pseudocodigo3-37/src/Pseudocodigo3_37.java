public class Pseudocodigo3_37 {

	public static void main(String[] args) {
		final int F = 4;
		final int C = 5;
		int matriz [][], filas, columnas;
		matriz = new int[F][C];
		System.out.println("\tMatriz normal (4x5)");
		for (filas=0; filas<F; filas++){
			System.out.println();
			for (columnas=0; columnas<C; columnas++){
				matriz [filas][columnas]=(int)Math.floor(Math.random()*100+1); //generar matriz 4x5 con nums entre 1 y 100
				System.out.printf("%5d", matriz [filas][columnas]);
			}
		}
		System.out.println("\n"); //2 saltos de linea
		System.out.println("\tMatriz transpuesta (5x4)");
		for (columnas=0; columnas<C; columnas++){ //se recorre por columnas
			System.out.println();
			for (filas=0; filas<F; filas++){
				System.out.printf("%5d", matriz [filas][columnas]); //intercambiar valor filas por columnas
			}
		}

	}//main

}//Class
