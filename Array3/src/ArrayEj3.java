/*Leer un vector de 20 enteros. Encontrar el mayor y el menor de ellos y los lugares donde se encuentran.*/
public class ArrayEj3 {

	public static void main(String[] args) {
		final int n = 20;
		int Array1 [];
		Array1 = new int[n];
		int i,conta=0, max=0, min=0;
		double media;
		String s1="";
		System.out.print("Lista de 20 numeros: ");
		for (i=0; i < n; i++){
			Array1[i]=(int)Math.floor(Math.random()*21-10);
			conta = conta + Array1[i];
			s1 += Array1[i];
			System.out.print((int)Array1[i]);
			System.out.print(" ");
			if (max < Array1[i]){
				max = Array1[i];
			}
			if (min > Array1[i]){
				min = Array1[i];
			}
		}
		
		System.out.println(s1);
	
		System.out.println("Num max: " +max +" en la posicion " +s1.indexOf(max)); //no busca
		System.out.println("Num min: " +min +" en la posicion " +s1.indexOf(min));
	}//main

}//Class
