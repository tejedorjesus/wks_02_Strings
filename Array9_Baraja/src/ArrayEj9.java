import java.util.Scanner;

public class ArrayEj9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j=0,n;
		int conta=0;
		String cartaNum [] = {"1", "2", "3", "4", "5", "6", "7","A","B","C"};
		String palo [] = {"O", "C", "E", "B"};
		String carta [] = new String[40];
		String nuevaCarta="";
		System.out.println("Pulsa 0 para salir");
		n = sc.nextInt();
		while (n!=0){ 
			
			int numRandom = (int) Math.round(Math.random() * 9 ) ;
			int numRandom2 = (int) Math.round(Math.random() * 3 ) ;
			nuevaCarta=cartaNum[numRandom]+palo[numRandom2];
			
			for (i=0; i<carta.length; i++){ 	
				//System.out.println(carta[i]);
				if (nuevaCarta.equals(carta[i])){
					System.out.println("Ya ha salido");
					carta[conta]=null; //Se sobreescribe luego. 2 mensajes?
				}
			}
			carta[conta]=cartaNum[numRandom]+palo[numRandom2];
			System.out.println(carta[conta]);
			conta++; //lugar??
			
			System.out.println("Pulsa 0 para salir");
			n = sc.nextInt();
		}
	}//main

}//Class
