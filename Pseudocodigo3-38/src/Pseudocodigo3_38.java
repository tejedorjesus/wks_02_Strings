import java.util.Scanner;

public class Pseudocodigo3_38 {

	public static void main(String[] args) {
		final int alumno = 30;
		final int asig = 10;
		int Array1 [][],i,j,conta=0, numRandom; 
		Array1 = new int[alumno][asig];
		Scanner sc = new Scanner(System.in);
		
		for (i=0;i<alumno; i++){
			numRandom=
			conta=0;
			System.out.println();
			for (j=0; j<asig; j++){
				Array1 [i][j]=(int)Math.floor(Math.random()*11);
				System.out.printf("%5d", Array1 [i][j]);
				conta+=Array1[0][j];
			}
			System.out.print("  La media es: " +(float)conta/10); //Misma media
		}
		
	}//main

}//Class
