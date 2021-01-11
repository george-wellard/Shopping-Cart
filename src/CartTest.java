import java.util.Comparator;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class CartTest {

	public static void main(String[] arg) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer("123", new Name("Joe", "Bloggs"));
		Date date = new Date(13, 01, 20);
		Cart cart = new Cart("2432", customer, date);
		
		Product product1 = new Product("001", "Banana", 25);
		Product product2 = new Product("002", "Apple", 50);
		DiscountProduct product3 = new DiscountProduct("003", "Juice", 90, 0.5);
		
		cart.addOrder(new Order(product1, 3));
		cart.addOrder(new Order(product2, 4));
		cart.addOrder(new Order(product3, 1));

		System.out.println(cart.toString() + "\n"); 
		
		// USE CASE 1
		
		for (Order order : cart)
		{
			order.listOrder();
		}
		
		System.out.println("Number of orders: " + cart.orderNumber());
		System.out.println("Total Cost: " + cart.getTotalCost() + "\n");

		
		// USE CASE 2
		
		System.out.println("Sorting Orders...");
		cart.sortOrders();
		System.out.println(cart.ListOrders());
		
		System.out.println("Reversing Order...");
		cart.sortOrders(Comparator.reverseOrder());
		System.out.println(cart.ListOrders());
		
		System.out.println("Natural Order....");
		cart.sortOrders(Comparator.naturalOrder());
		System.out.println(cart.ListOrders());
		
		// USE CASE 3
		
		System.out.println("Contains Order...");
		System.out.println(cart.containsOrder(new Order(product2, 4)));
	//	System.out.println("Order contains 'Coke' " + cart.containsOrder());
		
		System.out.println( "\n" + "Removing Order...");
		cart.removeOrder(cart.getOrder(1));
		System.out.println(cart.ListOrders());
		
		String fileName = "Cart.txt";
		
		PrintWriter write = null; 
		try 
		{
			write = new PrintWriter(fileName); 
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		write.println(cart.getCartId() + "/n");
		write.println(customer.toString() + "/n");
		write.println(date.getDateString() + "/n");
		write.println(cart.ListOrders() + "\n");
		write.println("Amount of orders: " + cart.orderNumber() + "\n");
		write.println("Total cost: " + cart.getTotalCost() + "\n");
		
		write.close();
		
		// USE CASE 4
		
		System.out.println(cart.findOrder("003"));
		
		System.out.println("\n" + "Decrease Order...");
		System.out.println(cart.getOrder(0));
		cart.getOrder(0).decreaseQuanity(2);
		System.out.println(cart.getOrder(0));
		
	}

}
