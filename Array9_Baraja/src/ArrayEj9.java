import java.util.Scanner;

public class ArrayEj9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j=0,n;
		String cartaNum [] = {"1", "2", "3", "4", "5", "6", "7","A","B","C"};
		String palo [] = {"O", "C", "E", "B"};
		String carta [] = new String[40];
		String carta2="";
		System.out.println("Pulsa 0 para salir");
		n = sc.nextInt();
		while (n!=0){ 
			for (i=0; i<carta.length; i++){
				carta[i]="0";
			}
			int numRandom = (int) Math.round(Math.random() * 9 ) ;
			int numRandom2 = (int) Math.round(Math.random() * 3 ) ;
			carta2=cartaNum[numRandom]+palo[numRandom2];
			System.out.println(carta2);
			for (i=0; i<carta.length; i++){
				for (j=0; j < carta.length; j++){
					carta[i]=cartaNum[numRandom]+palo[numRandom2];
					System.out.println(carta[i]);
					if (carta[i]==cartaNum[numRandom]+palo[numRandom2]){
						System.out.println("Repetido");
					}
				}
				
			}
			System.out.println("Pulsa 0 para salir");
			n = sc.nextInt();
		}
	}//main

}//Class