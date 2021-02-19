package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entitie.Client;
import entitie.Order;
import entitie.OrderItem;
import entitie.Product;
import entitie.enuns.OrderStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse("23/11/1984");
		OrderStatus orderStatus=OrderStatus.PENDING_PAYMENT;
		
		Client cli = null;
		cli.setName("Pedro Henrique");
		cli.setEmail("pedrodemorais1@gmail.com");
		cli.setBirthDate(date);
		
		Product product = null;
		product.setName("TV");
		product.setPrice(2000.00);
		
		OrderItem orderItem = new OrderItem(2, 20.00);
		
		Order order = new Order(date, orderStatus, cli );
		System.out.println("Novo Exercicio");
		
		
		

	}

}
