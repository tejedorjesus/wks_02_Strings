/*Escribe un programa que pida por teclado una palabra y diga si es un palíndromo o no. 
Una palabra es un palíndromo si se lee igual de izquierda a derecha que de derecha a izquierda*/
import java.util.Scanner;
public class Hoja2Ej3_StringBuffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		StringBuffer sb = new StringBuffer(s1);
		sb = sb.reverse(); //invertir contenido de la cadena
		if (s1.equals(sb.toString())){
			System.out.println("Es un palíndromo");
		}else{
			System.out.println("No es un palíndromo");
		}
	}//main
}//Class