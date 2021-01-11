
public class Order implements Comparable<Order>{
	
	private int quanity; 
	
	private Product product;
	
	/**No order*/
	public Order()
	{
		quanity = 0;
	}
	
	/**Custom order*/
	public Order(Product product, int quanity)
	{
		this.product = new Product(product.getProductCode(), product.getDescription(), product.getUnitPrice());
		this.quanity = quanity;
	}
	
	/**Custom order for discount products*/
	public Order(DiscountProduct discount, int quanity)
	{
		this.product = new DiscountProduct(discount.getProductCode(), discount.getDescription(), discount.getUnitPrice(), discount.getDiscountRate());
		this.quanity = quanity;
	}
	
	
	public void setQuanity(int quanity)
	{
		this.quanity = quanity;
	}
	
	public int getQuanity()
	{
		return quanity;
	}
	
	public Product getProduct()
	{
		return product;
		
	}
	
	/**Increase quanity of order
	 @param number quanity is increased by*/
	public void increaseQuanity(int num)
	{
		int newQuanity = this.getQuanity() + num;
		
		quanity = newQuanity;
	}
	
	/**decrease quanity of order
	 @param number quanity is decreased by*/
	public void decreaseQuanity(int num)
	{
		int newQuanity = this.getQuanity() - num;
		
		quanity = newQuanity;
	}
	
	/**Getting overall cost of order
	 @return order price*/
	public int getCost()
	{
		int price = product.getUnitPrice();
		
		int newPrice = price * quanity;
		
		return newPrice;
	}
	
	/**Printing individual order data*/
	public void listOrder()
	{
		System.out.println(this.toString());
	}

	/**Testing for equality between orders
	 * @return equal order*/
	public boolean equals(Object obj)
	{
		if ((obj == null) || (this.getClass() != obj.getClass()))
		{
			return false;
		}
				
		Order other = (Order) obj;
				
		return this.product.getProductCode().equals(other.product.getProductCode())
				&& this.product.getDescription().equals(other.product.getDescription());
	}

	/**Comparing orders based on product description, then quanity
	 * @return comparison*/
	@Override
	public int compareTo(Order other) {
		// TODO Auto-generated method stub

		int result = product.getDescription().compareTo(other.product.getDescription());
		if(result == 0)
		{
			result = Integer.compare(quanity, other.quanity);
		}
		
		return result;
		
	}
	
	/**@return String of order data*/
	public String toString()
	{
		return "Order: [Product: " + product.toString() + "] Qaunity: " + quanity; 
	}

}