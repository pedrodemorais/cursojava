package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ConsultandoNaLista {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		int num=0;
		
		System.out.println("Digite os numeros a serem armazenados, digite 0 para parar:");
		
		do {
			
		num = input.nextInt();
		list.add(num);
		}while(num !=0);
		
		
		System.out.println("Numeros Digitados");
		for(Integer x: list) {
			System.out.print(" "+x);
			
		}
		System.out.println("\nDigite um numero para verificar se ele encontra na lista:");
		int num1 = input.nextInt();
		
		Integer lista = list.stream().filter(x-> x.equals(num1)).findFirst().orElse(null); 
		
		if(lista == null) {
			System.out.println("Não Existe");
			
		}else
			{System.out.println("Existe");}
		
	
	}
}
