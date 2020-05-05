package nelio.cursojava.entities.compo.exefixa;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import nelio.cursojava.entities.compo.exefixa.enums.OrderStatus;


public class Order {
	
	private Client client;
	private Date moment;
	private OrderStatus status;
	
	@SuppressWarnings("unused")
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	@SuppressWarnings("unused")
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	OrderItem order1 = new OrderItem();
		private List<OrderItem> itens = new ArrayList<>();
	
	public Order() {
		}

	public Order(Client client, Date moment, OrderStatus status) {
		super();
		this.client = client;
		this.moment = moment;
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
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

	public List<OrderItem> getItens() {
		return itens;
	}

	public void addLista(String name, Double price, int quantity) {
		this.itens.add(new OrderItem(quantity, price, new Product(name)));
	}
	
	public void addLista(OrderItem item) {
		itens.add(item);
	}
	
	double sum = 0.0;
	public double total() {
		for(OrderItem soma : itens) {
			 sum += soma.subTotal();
		}
			 return sum;
	}
	
}
