package VetoreseMatrizes;

import java.util.Scanner;

public class ExercicioArrayMatriz {

	public static void main(String[] args) {
		int matriz[][]=new int [3][3];
		int linha,coluna,somaDiagonal=0,somaDiagsec=0;
		Scanner leia=new Scanner(System.in);

		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nEntre com um numero: ");
				matriz[linha][coluna]=leia.nextInt();
			
		
			if(linha==coluna) {
					System.out.println("\nNúmero está na Diagonal!");
					somaDiagonal+=matriz[linha][coluna];
			
			if((linha+coluna)==2){
					System.out.println("\nNúmero está na Diagonal Secundária!");
					somaDiagsec+=matriz[linha][coluna];
			}
			}
		}
			
					System.out.println("\nA soma dos números na Diagonal são: "+somaDiagonal);
	
					System.out.println("\nA soma dos números na Diagonal Secundária são: "+somaDiagsec);
	}
}
}


