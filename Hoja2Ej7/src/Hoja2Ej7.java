
import java.util.Arrays;
import java.util.Scanner;
//MALLLLLLLL//MALLLLLLLL//MALLLLLLLL//MALLLLLLLL//MALLLLLLLL//MALLLLLLLL//MALLLLLLLL//MALLLLLLLL//MALLLLLLLL//MALLLLLLLL
public class Hoja2Ej7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		char arrayConta [];
		arrayConta = new char[5];
		int i,j,contaA=0,contaE=0,contaI=0,contaO=0,contaU=0;
		char vocales[]={'a', 'e', 'i', 'o', 'u'};
		System.out.println("Escribe una palabra");
		s1 = sc.nextLine();
		for (i=0; i<s1.length(); i++){
			char vocal = s1.charAt(i);
			if (vocal == 'a'){
				arrayConta[i]++;
			}else if (vocal == 'e'){
				arrayConta[i]++;
			}else if (vocal == 'i'){
				arrayConta[i]++;
			}else if (vocal == 'o'){
				arrayConta[i]++;
			}else if (vocal == 'u'){
				arrayConta[i]++;
			}
			System.out.println(arrayConta[i]);
		}
		
		
		//System.out.println("La vocal que m�s se repite es " +" y se repite " +contaU +" veces");
		
			
		
	}//main
	
}//Class