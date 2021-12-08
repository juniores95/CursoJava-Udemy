package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private List<Orderitem> itens = new ArrayList<>();
	
	private Client client;
	
	public Order() {
		
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;		
		this.client = client;
	}

	public Order(Date moment) {
		this.moment = moment;
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

	public void addItem(Orderitem item) {
		itens.add(item);
	}
	
	public void removeItem(Orderitem item) {		
		itens.remove(item);
	}
	
	public double total() {
		double sum = 0;
		for(Orderitem c: itens) {
			sum += c.subTotal();			
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY \n");
		sb.append("Order Moment \n" + sdf.format(moment) + "\n");
		sb.append("Order Status \n" + status + "\n");
		sb.append("Client: \n" + client + "\n");
		sb.append("Order Items \n");
		
		for (Orderitem c : itens) {
			sb.append(c + "\n");
		}
		
		sb.append("Total price $ ");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
}
