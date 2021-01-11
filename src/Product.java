
public class Product implements Comparable<Product>{
	
	private String productCode;
	private String description;
	private int unitPrice;
	
	/**No Product*/
	public Product()
	{
		productCode = "No Product ";
		description = "No Product ";
		unitPrice = 0;
	}
	
	/**Customer constructor*/
	public Product(String productCode, String description, int unitPrice)
	{
		this.productCode = productCode;
		this.description = description;
		this.unitPrice = unitPrice;
	}
	
	
	public String getProductCode()
	{
		return productCode;
	}
	
	public String getDescription()
	{
		return description;
	}

	public int getUnitPrice()
	{
		return unitPrice;
	}

	/**Comparing products by code, then description, then price
	 * @return comparison*/
	@Override
	public int compareTo(Product other) {
		// TODO Auto-generated method stub
		
		int result = productCode.compareTo(other.productCode);
		if(result == 0)
		{
			result = description.compareTo(other.description);
			if(result == 0)
			{
				result = Integer.compare(unitPrice, other.unitPrice);
			}
			
		}
		
		return result;	
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
		
		Product other = (Product) obj;
		
		return this.productCode.equals(other.productCode) 
				&& this.description.equals(other.description)
				&& this.unitPrice == other.unitPrice;
		
	}
	
	/**@return string of product data*/
	public String toString()
	{
		return "productCode: " + productCode + " description: " + description + " unit price: " + unitPrice;
	}

}
