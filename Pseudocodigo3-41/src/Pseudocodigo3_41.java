public class Pseudocodigo3_41 {

	public static void main(String[] args) {
		int i,j=0,k=0, conta=0, max=0, num1, num2, num3;
		num1 =(int)Math.floor(Math.random()*11);
		num2 =(int)Math.floor(Math.random()*11);
		num3 =(int)Math.floor(Math.random()*11);
		int tabla [][][] = new int[5][10][20];

		for (i=0; i<5; i++){
			conta=0;
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------------");
			for (j=0; j<10; j++){
				conta += tabla[0][j][0];
				System.out.println();
				for (k=0; k<20; k++){
					tabla[i][j][k]=(int)Math.floor(Math.random()*11);
					System.out.printf("%5d", tabla[i][j][k]);
				}
			}
		}
		System.out.println("\n----------------------------------------------------------------------------------------------------");
		System.out.println("\n----------------------------------------------------------------------------------------------------");

		for (i=0; i<5; i++){
			System.out.println();
			System.out.println();
			for (j=0; j<10; j++){
				System.out.println("La nota media del curso #" +(j+1) +" del centro # " +(i+1) +" es " +(float)conta/10);
				System.out.println();
				for (k=0; k<20; k++){
				}
			}
		}
		System.out.println("\n----------------------------------------------------------------------------------------------------");



	}//main
	
}//Class
