import java.util.Scanner;

public class Hoja2Ej5 {
	//MAL//MAL//MAL//MAL//MAL//MAL//MAL//MAL//MAL
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		int i;
		System.out.println("Introduce una frase: ");
		s1 = sc.nextLine();
		char ultimo = s1.charAt(s1.length()-1);
		char primero = s1.charAt(0);
		System.out.println(s1.replace(ultimo, primero).replace(primero, ultimo));	

	}//main
	
}//Class