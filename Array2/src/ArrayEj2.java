import java.util.*;
public class ArrayEj2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		final int n = 10;
		int Array1 [];
		int Array2 [];
		int Array3 [];
		Array1 = new int[n];
		Array2 = new int[n];
		Array3 = new int[n];
		System.out.println("Introduce el primer array");
		for (i=0; i < n; i++){
			System.out.print("Numero: ");
			Array1[i] = sc.nextInt();
		}
		System.out.println("Introduce el segundo array");
		for (i=0; i < n; i++){
			System.out.print("Numero: ");
			Array2[i] = sc.nextInt();
		}
		System.out.print("");
		System.out.print("La suma de los dos arrays es: ");
		for (i=0; i < n; i++){
			Array3[i] = Array1[i] + Array2[i];
			System.out.print(Array3[i]);
		}
		System.out.print(" (Array #3)");
		System.out.println("");
		System.out.print("Array 1: ");
		for (i=0; i < n; i++){
			System.out.print(Array1[i]);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.print("Array 2: ");
		for (i=0; i < n; i++){
			System.out.print(Array2[i]);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.print("Array 3: ");
		for (i=0; i < n; i++){
			System.out.print(Array3[i]);
			System.out.print(" ");
		}
	}//main

}//Class