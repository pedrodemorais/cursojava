package view;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploDeList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();// String dentro do <> é o genérics
		
		list.add("Pedro");
		list.add("Duda");
		list.add("Biel");
		list.add("Paulo");
		
		System.out.println("-------------Início da Lista -------------------------------------------------");
		System.out.println("Numero de elementos da lista: "+list.size());
		for(String x: list) {
			System.out.println(x);
			
		}
		System.out.println("-------------Adicionando mais na Lista setando a posição 3 e outros --------------------");
		
		list.add(3, "Karla");  /*Adicionar na lista setando a posição */
		
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
		
		System.out.println("-------------Removendo na Lista por endereço  --------------------");
		list.remove(6);// removendo por endereço
		
		
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
		System.out.println("------Localizando a posição do elemento usando indexOf  --------------------");
		
		System.out.println("IndexOf da Duda: "+list.indexOf("Duda"));
		System.out.println("IndexOf de alguém que não existe na lista: "+list.indexOf("Luiz"));

		for(String y: list) {
			System.out.println(y);
		}
		
		System.out.println("---------------- Localizando na lista o primeiro nome que começa com a letra D---------------" );
		
		String name = list.stream().filter(x -> x.charAt(0)=='D').findFirst().orElse(null);
		
		System.out.println("O primeiro nome que começa com D é: "+name);
		
		System.out.println("------Pegando na lista todos os nomes que começam com a letra P  --------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0)=='P').collect(Collectors.toList());
		
		for(String x: result) {
		System.out.println(x);
		}
		
		
	
	}

}
