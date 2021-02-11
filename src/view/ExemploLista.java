package view;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploLista {

	public static void main(String[] args) {

		// list � uma interface Arraylist � uma classe que implementa a interface List
		List<String> list = new ArrayList<String>(); /* entre o sinal de maior e menor � o generics */
		

		list.add("Pedro");
		list.add("Paula");
		list.add("Paulo");
		list.add("Karla");
		list.add("Paloma");
		list.add("Dudinha");
		list.add("Davi");
		
		System.out.println("----------- Lista de Nomes -----------------");

		for (String x : list) {
			
			System.out.println(x);
		}
		
		//Localizando o primeiro elemento que come�a com a letra P
		System.out.println("----------------------------------------------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0)=='D').findFirst().orElse(null);
		System.out.println("Primeiro Nome com D: "+name);
		
		// inserir um novo elemento na posi��o 2(dois)
		list.add(2, "Duda");
		
		System.out.println("----------- Lista de Nomes com novo nome na posi��o 2 -----------------");
		
		for (String x : list) {
			
			System.out.println(x);
		}
		
		list.add("Biel");
		
		System.out.println("----------- Lista de Nomes com novo nome adicionado -----------------");
		
		for (String x : list) {
			
			System.out.println(x);
		}
		
		
		// mostrando o tamanho da lista
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("Tamanho da lista: " + list.size());
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("-------- Removendo um dado: PEDRO e o nome da posi��o 2 ----------");
		
		// removendo um dado
		list.remove("Pedro");// removendo de acordo com o "nome"
		list.remove(2);// removendo por endere�o , tera que remover a Paulo
		/*---------------------------------------------------------------------------*/

				
		for (String x : list) {

			System.out.println(x);
		}
		
		
		System.out.println("-------- Removendo um dado por predicado Todo nome que come�a com P ----------");
		// removendo por predicado
		list.removeIf(x -> x.charAt(0) == 'P');

		for (String x : list) {

			System.out.println(x);
		}
		System.out.println("--------------------------------------------");
		
		// localizando uma posi��o de um elemento
		System.out.println("Localizando a Posi��o de um elemento");
		System.out.println("Index of Duda: "+ list.indexOf("Duda"));
		
		// localizando uma posi��o de um elemento que n�o se encontra na lista
		System.out.println("Index of Divina: "+ list.indexOf("Divina"));

		// deixando na lista de acordo com um predicado especifico
		System.out.println("----Lista somente com nome que come�a com D -------------------------");
		
		List<String> nomeComD = list.stream().filter(x -> x.charAt(0)=='D').collect(Collectors.toList());
		for(String x: nomeComD) {
			System.out.println(x);
		}
		
		//Localizando o primeiro elemento que come�a com a letra D
		
		System.out.println("------------------------------------------------------");
		System.out.println("Nome com v na posi��o dois");
		System.out.println("------------------------------------------------------");
		String name1 = list.stream().filter(x -> x.charAt(2)=='v').findFirst().orElse(null);
		System.out.println(name1);
		
		
	}

}
