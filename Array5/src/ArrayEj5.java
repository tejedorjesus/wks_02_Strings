
public class ArrayEj5 {

	public static void main(String[] args) {
		int i,j;
		final int n = 10;
		int Array1 [];
		int Array2 [];
		Array1 = new int[n];
		Array2 = new int[n];
		System.out.print("Array 1: ");
		for (i=0; i<n; i++){
			Array1[i]=(int)Math.floor(Math.random()*5+1);
			System.out.print(Array1[i]);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.print("Array 2: ");
		for (j=0; j<n; j++){
			Array2[j]=(int)Math.floor(Math.random()*5+1);
			System.out.print(Array2[j]);
			System.out.print(" ");
		}
		System.out.println("");
		for (i=0; i<n; i++){
			for (j=0; j<n; j++){
				if (Array1[i]==Array2[j]){
					System.out.print(Array1[i] +" esta "); //MAL
			}
			
			}
		}

	}//main

}//Class
