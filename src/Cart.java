import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

public class Cart implements Iterable<Order>{
	
	
	// Fields 
	private String cartId;
	private Customer customer;
	private Date date;
	private List<Order> orders;
	
	/**Unused Cart */
	public Cart()
	{
		cartId = "No Cart";
		customer = new Customer();
		date = new Date();
		orders = new ArrayList<>();
	}
	
	/**Cart given name and empty list of orders
	 * @param Cart name
	 * */
	public Cart(String cartId, Customer customer, Date date)
	{
		this.cartId = cartId;
		this.customer = new Customer();
		this.date = new Date();
		orders = new ArrayList<Order>();
	}
	
	/**Getting cart name
	*@return cart name */
	public String getCartId()
	{
		return cartId;
	}
	
	/**Getting total sum of order costs 
	 * @return Total cost */
	public int getTotalCost()
	{	
		int total = 0;
		for(Order o : orders)
		{
			total = total + o.getCost();
		}
		
		return total;
		
	//	return orders.stream().mapToInt(o -> o.getCost()).sum();
	}
	
	/**Adding order to cart lists
	 * @param order being added
	 * */
	public void addOrder(Order order)
	{
		orders.add(order);
	}
	
	/**Iterator to iterate through order list
	 * @return Iterator
	 * */
	public Iterator<Order> iterator() 
	{
		return orders.iterator();
	}
	
	/**Checking order list if it contains an order
	 * @param Order being checked if list contains
	 * @return True or False if order is equal to parm
	 * */
	public boolean containsOrder(Order order)
	{
		return orders.contains(order);
	}
	
	/**Removing order from list
	 * @param Order being removed
	 * */
	public void removeOrder(Order order)
	{
		orders.remove(order);
	}
	
	/**Getting the number of orders on list*/
	public int orderNumber()
	{
		return orders.size();
	}
	
	/**Clearing order list*/
	public void clearOrder()
	{
		orders.clear();
	}
	
	/**Finding a specific order
	 * @param ProductCode being searched to find order
	 * @return Matching order
	 * */
	public Order findOrder(String productCode)
	{
		for(Order o : orders)
		{
			if(productCode.equals(o.getProduct().getProductCode()));
			{
				return o;
			}
		}

		return null;
		
	}
	
	/**Printing list of orders
	 * @return String of order list
	 * */
	public String ListOrders()
	{
		String s = "Cart: " + this.cartId + "\n";
		for(int i = 0; i < orders.size(); i++)
		{
			s = s + (i+1) + "\t" + orders.get(i).toString() + "\n";
		}
		return s;
	}
	
	/** Returning Order at index
	 *@return Order at index 
	 * */
	public Order getOrder(int i)
	{
		Order o = null;
		
		if (0 <= i && i < orders.size()) {
            o = orders.get(i);
        } else {
            o = null; // i is out of range
        }
        return o;
	}
	
	/***/
	public void mergeOrders(Cart cart)
	{
		cart.forEach(order -> orders.add(order));
	}
	
	/**Sorting orders in against description*/
	public void sortOrders()
	{
		Collections.sort(orders);
	}
	
	/**Sorting orders to a specific way
	 * @param Accessing comparator methods
	 * */
	public void sortOrders(Comparator<Order> order)
	{
		orders.sort(order);
	}
	
	/**String for cart data
	 * @return data string */
	@Override
	public String toString()
	{
		return "Cart ID: " + cartId + " orderlist: " + orders;
	}
	
}
