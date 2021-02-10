package view;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploDeList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();// String dentro do <> � o gen�rics
		
		list.add("Pedro");
		list.add("Duda");
		list.add("Biel");
		list.add("Paulo");
		
		System.out.println("-------------In�cio da Lista -------------------------------------------------");
		System.out.println("Numero de elementos da lista: "+list.size());
		for(String x: list) {
			System.out.println(x);
			
		}
		System.out.println("-------------Adicionando mais na Lista setando a posi��o 3 e outros --------------------");
		
		list.add(3, "Karla");  /*Adicionar na lista setando a posi��o */
		
		list.add("Divina");
		list.add("Zelia");
		
		System.out.println("Numero de elementos da lista: "+list.size());
		
		for(String x: list) {
			System.out.println(x);
			
		}
		System.out.println("-------------Removendo na Lista a Zelia e add Luiz  --------------------");
		
		list.remove("Zelia");/*Removendo passando o nome */
		list.add("Luiz");/*Removendo passando o nome */
		
		System.out.println("Numero de elementos da lista: "+list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------Removendo na Lista por endere�o  --------------------");
		list.remove(6);// removendo por endere�o
		
		
		System.out.println("Numero de elementos da lista: "+list.size());
		
		for(String x : list) {
			System.out.println(x);
			
		}
		System.out.println("------Removendo por Predicado tirando nome que inicia com K  --------------------");
		/*RETIRANDO NOME QUE INICIA COM O CARACTER K*/
		
		list.removeIf(x -> 	x.charAt(0) =='K');
		System.out.println("Numero de elementos da lista: "+list.size());
		
		for(String y: list) {
			System.out.println(y);
		}
		System.out.println("------Localizando a posi��o do elemento usando indexOf  --------------------");
		
		System.out.println("IndexOf da Duda: "+list.indexOf("Duda"));
		System.out.println("IndexOf de algu�m que n�o existe na lista: "+list.indexOf("Luiz"));

		for(String y: list) {
			System.out.println(y);
		}
		
		System.out.println("---------------- Localizando na lista o primeiro nome que come�a com a letra D---------------" );
		
		String name = list.stream().filter(x -> x.charAt(0)=='D').findFirst().orElse(null);
		
		System.out.println("O primeiro nome que come�a com D �: "+name);
		
		System.out.println("------Pegando na lista todos os nomes que come�am com a letra P  --------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0)=='P').collect(Collectors.toList());
		
		for(String x: result) {
		System.out.println(x);
		}
		
		
	
	}

}
