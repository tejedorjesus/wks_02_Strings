import java.util.*;
public class Ejer11T4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int i;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		while (s1.length() > 20){
			System.out.println("Escribe una frase menor de 20 caracteres");
			s1 = sc.nextLine();
		}
		for (i=0; i<s1.length(); i++){
			s1=s1.charAt(s1.length()-1)+ s1.substring(0,s1.length()-1);
			System.out.println(s1);
		}
	}//main

}//CLass
