import java.util.Scanner;

public class Hoja2Ej2 {
	//MALLLLLL
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int i, conta=0, posicion=0;
		char a;
		char vacio='0';
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		System.out.println("Escribe una letra");
		a = sc.next().charAt(0); //pedir char por teclado
		for (i=0; i<s1.length(); i++){
			if (s1.charAt(i)==a){
				conta++;
				posicion=s1.charAt(i);
				if (conta==1 || conta==2 || conta==3){
					posicion=s1.charAt(vacio);
					
				}
				
			}
			System.out.print(posicion);
		}


	}//main

}//Class
