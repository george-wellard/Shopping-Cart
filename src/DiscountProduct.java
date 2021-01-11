
public class DiscountProduct extends Product {
	
	double discountRate;
	
	/**No Product*/
	public DiscountProduct()
	{
		super();
		discountRate = 0;
	}
	
	/**Customer constructor*/
	public DiscountProduct(String productCode, String description,int unitPrice, double discountRate)
	{
		super(productCode, description, unitPrice);
		this.discountRate = discountRate;
	}
	
	public double getDiscountRate()
	{
		return discountRate;
	}
	
	/**Calculate price with discount
	 * @return updated price*/
	@Override
	public int getUnitPrice()
	{
		int price;
		
		price = (int) (super.getUnitPrice() * this.discountRate);
		
		return price;
	}
	
	/**Testing for equality between products
	 * @return equal product*/
	@Override
	public boolean equals(Object obj)
	{
		if((obj == null) || (this.getClass() != obj.getClass()))
		{
			return false;
		}
		
		DiscountProduct other = (DiscountProduct) obj;
		
		return this.discountRate == other.discountRate;
		
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " Discount Rate: " + discountRate;
	}

}
