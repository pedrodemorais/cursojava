package view;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class ClassMain {

	public static void main(String[] args) {
		
		System.out.println("-------------Exemplo de enum-----------------------------\n");

		Order order = new Order(58245,new Date(), OrderStatus.PROCESSING);
		System.out.println(order);
		
		System.out.println("\n-------------Conversão de String para enum-----------------------------");

		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
