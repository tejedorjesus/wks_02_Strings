
public class ArrayEj5 {

	public static void main(String[] args) {
		final int f = 10;
		final int c = 10;
		int Array1 [][];
		Array1 = new int[f][c];
		int i,j=0, sumaF=0, sumaC=0;
		for (i=0; i<f; i++){
			for (j=0; j<c; j++){
				Array1[i][j]=(int)Math.floor(Math.random()*11-5);	
			}
		}
		for (i=0; i<f; i++){
			for (j=0; j<c; j++){
				sumaF=sumaF+Array1[i][j];
			}
			System.out.println("Suma fila #" +(i+1) +": " +sumaF); //suma de filas. ???
		}

	}//main

}//Class 
/*
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] 
[] [] [] [] [] [] [] [] [] [] */
