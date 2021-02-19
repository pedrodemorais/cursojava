package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitie.Client;
import entitie.OrderItem;
import entitie.Product;
import entitie.enuns.OrderStatus;
import entitie.Order;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		OrderStatus orderStatus;
		Order order = null;
		Date dateOrder = new Date();

		System.out.println("Enter Client data: ");

		System.out.print("Name: ");
		String nameClient = input.nextLine();

		System.out.print("Email: ");
		String email = input.nextLine();

		System.out.print("Birth date(DD/MM/YYYY) ");
		Date birthDate = sdf.parse(input.nextLine());

		Client client = new Client(nameClient, email, birthDate);

		System.out.println("Enter Order Data:");
		System.out.print("Status: ");
		String status = input.nextLine();

		System.out.print("How many items to this order? ");
		int numOfItems = input.nextInt();

		for (int i = 0; i < numOfItems; i++) {

			input.nextLine();
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product Name: ");

			String nameProduct = input.nextLine();
			System.out.print("Product Price: ");

			Double priceProduct = input.nextDouble();
			System.out.print("Quantity: ");
			Integer quantityProduct = input.nextInt();
			Product product;
			OrderItem orderItem = new OrderItem(quantityProduct, priceProduct,
					  product = new Product(nameProduct, priceProduct));
			order = new Order(dateOrder, OrderStatus.valueOf(status), client);
			order.addItem(orderItem);

		}
		System.out.println("\nORDER SUMARY: ");
		System.out.println("Order moment: " + sdf2.format(order.getMoment()));
		System.out.println("Order Status: " + order.getStatus());
		System.out.println("Client: " + order.getClient().getName() + " ("
				+ sdf.format(order.getClient().getBirthDate()) + ") - " + order.getClient().getEmail());
		System.out.println("Order items:");
		System.out.println(order);

	}

}
