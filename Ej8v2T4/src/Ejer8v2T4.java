import java.util.Scanner;

public class Ejer8v2T4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s2="";
		int i, n;
		char ch;
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		String mayus = s1.toUpperCase();
		while (s1.compareTo(mayus)>0){ 
			System.out.println(s1);
			System.out.println(mayus);
			System.out.println("Escribe una frase en mayusculas");
			s1 = sc.nextLine();
			mayus = s1.toUpperCase();
		}
		System.out.println("Introduce un numero para codificar");
		n = sc.nextInt();
		
		for (i=0; i<s1.length(); i++){
			ch = s1.charAt(i);
			if (ch >= 'A' && ch <= 'Z'){
				ch = (char)(ch + n);
			}
			if (ch > 'Z'){
				ch = (char)((ch - n)%26);
				//ch = (char)(ch - 'Z' + 'A' - 1);
			}
			s2 += ch;
		}
		System.out.println(s2);
	}//main

}//Class
