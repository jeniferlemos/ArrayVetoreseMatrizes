package VetoreseMatrizes;

import java.util.Scanner;

public class exercicioArrayVetor {

	public static void main(String[] args) {
		
	int Vetor[]= new int[10];
	int Soma=0,x;
	float Media;
	Scanner leia= new Scanner(System.in);
	
	for(x=0;x<10;x++) {
		
		System.out.println("\nEntre com o Número: ");
		Vetor[x]=leia.nextInt();
		
		if (x % 2==1) {
		System.out.println("\nÉ um Número Impar: "+Vetor[x]);
	}
		if (Vetor[x] % 2==0) { 
			System.out.println("\nÉ um Número Par: "+Vetor[x]);
		}
			Soma += Vetor[x];
	}
			Media=Soma/x;
			System.out.println("\nSoma dos números no Vetor: "+Soma);
			System.out.println("\nMedia dos números no Vetor: "+Media);
	}
	}


