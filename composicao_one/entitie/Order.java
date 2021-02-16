package entitie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitie.enuns.OrderStatus;

public class Order {

	
		private Date moment;
		private OrderStatus status;
		private Client client = new Client();
		private List <OrderItem> items = new ArrayList<>();
		
		public Order() {
			
		}
		
		public Order(Date moment, OrderStatus status, Client client) {
			this.moment = moment;
			this.status=status;
			this.client = client;
			
		}
		
	public Date getMoment() {
			return moment;
		}

		public void setMoment(Date moment) {
			this.moment = moment;
		}

		public OrderStatus getStatus() {
			return status;
		}

		public void setStatus(OrderStatus status) {
			this.status = status;
		}

		public Client getClient() {
			return client;
		}

		public void setClient(Client client) {
			this.client = client;
		}

	public void addItem (OrderItem item) {
		items.add(item);
		
	}
	public void removeItem (OrderItem item) {
		items.remove(item);
		
	}
	
	public double total() {
		return 2l;
	}

	@Override
	public String toString() {
		return "Order [moment=" 
	+ moment 
	+ ", status=" 
	+ status 
	+ ", client=" 
	+ client 
	+ ", items=" 
	+ items 
	+ "]";
	}
	
	

}
