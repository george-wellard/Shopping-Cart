import java.util.HashSet;

public class RewardProcessor {
	
	HashSet<Product> products;
	
	public RewardProcessor()
	{
		products = new HashSet<Product>();
	}
	
	public boolean addProduct(Product product) 
	{
		products.add(product);
		
		return false;
	}
	

	public int rewardPoints(Cart cart)
	{
		return 0;
	}

}
