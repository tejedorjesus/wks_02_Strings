import java.util.Scanner;

public class ArrayEj7 {

	public static void main(String[] args) {
		final int f = 10;
		final int c = 10;
		int Array1 [][];
		Array1 = new int[f][c];
		int i,j=0,temp, fila1=0, fila2=0;
		for (i=0; i<f; i++){
			for (j=0; j<c; j++){
				Array1[i][j]=(int)Math.floor(Math.random()*21-10);
				System.out.println(Array1[i][j] +"["+i+"]" +"["+j+"]");
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de fila que quieras mover: ");
		fila1 = sc.nextInt();
		while (fila1<1 || fila1>5){
			System.out.println("Numero entre 1 y 5 ");
			fila1 = sc.nextInt();
		}
		System.out.println("Introduce el numero de fila donde quieras mover la anterior: ");
		fila2 = sc.nextInt();
		while (fila2<1 || fila2>5){
			System.out.println("Numero entre 1 y 5 ");
			fila2 = sc.nextInt();
		}
		for (i=0; i<f; i++){ //Sobreescribe la fila1
			temp = Array1[fila1-1][i];
			Array1[fila1-1][i] = Array1[fila2-1][i];
			Array1[fila2-1][i] = temp;
		}
		for (i=0; i<f; i++){
			for (j=0; j<c; j++){
				System.out.println(Array1[fila2-1][j] +"["+i+"]" +"["+j+"]");
			}
		}
	}//main

}//Class
