public class ArrayEj1 {
/*	Se generan 20 n�meros aleatorios de tipo entero entre -10 y 10 almacen�ndolos en un vector. 
 * Hay que calcular y mostrar la media y, adem�s, mostrar cu�ntos n�meros hay: 
 * -Superiores a la media -Inferiores a la media -Iguales a la media 
*/	public static void main(String[] args) {
		final int n = 20;
		int Array1 [];
		Array1 = new int[n];
		int i,conta=0, max=0, min=0;
		double media;
		System.out.print("Lista de 20 numeros: ");
		for (i=0; i < n; i++){
			Array1[i]=(int)Math.floor(Math.random()*21-10);  //(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
			conta = conta + Array1[i];						//				                 *  (10  + 10)  - 10 
			System.out.print((int)Array1[i]);
			System.out.print(" ");
			if (max < Array1[i]){
				max = Array1[i];
			}
			if (min > Array1[i]){
				min = Array1[i];
			}
		}	
		System.out.println();
		media = (double) conta/20;
		System.out.println("La media es: " +media);
		System.out.println("Num max: " +max);
		System.out.println("Num min: " +min);
		
		System.out.print("Numeros mayores que " +media +": ");
		for (i=0; i < n; i++){
			if (Array1[i] > media){
				System.out.print((int)Array1[i]);
				System.out.print(" ");
			}		
		}
		System.out.println();
		System.out.print("Numeros menores que " +media +": ");
		for (i=0; i < n; i++){
			if (Array1[i] < media){
				System.out.print((int)Array1[i]);
				System.out.print(" ");
			}		
		}
		System.out.println();
		System.out.print("Numeros iguales que " +media +": ");
		for (i=0; i < n; i++){
			if (Array1[i] == media){
				System.out.print((int)Array1[i]);
				System.out.print(" ");
			}
		}
	}//main

}//Class
