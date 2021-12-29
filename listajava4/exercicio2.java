package listajava4;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		int numeros[]=new int[6];
		int cont,resto,contpar=0,contimpar=0,somapar=0;
		Scanner leia = new Scanner (System.in);
		
			for(cont=0;cont<6;cont++)
			{
				System.out.println("Insira um numero:");
				numeros[cont]=leia.nextInt();
				resto=numeros[cont]%2;
				
			{
				if (resto==0)
			{
					somapar=numeros[cont]+somapar;	}
				else
			{	
					contimpar++	;   }		
			}		
			}
				for(cont=0;cont<6;cont++)
					{resto=numeros[cont]%2;
				if(resto==0)			
					System.out.println("numeros pares :"+numeros[cont]);	
			}
				for(cont=0;cont<6;cont++)
				{resto=numeros[cont]%2;
			if(resto!=0)			
				System.out.println("numeros impares :"+numeros[cont]);
		
				}
					System.out.println("Soma de pares :"+somapar);
					System.out.println("Quantiade de numeros impares:"+contimpar);
				}

	}
