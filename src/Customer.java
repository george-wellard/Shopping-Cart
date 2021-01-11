
public class Customer {
	
	private String customerID;
	
	private Name name;
	private int rewardPoints;
	
	public Customer()
	{
		customerID = "";
		name = new Name();
		rewardPoints = 0;
	}
	
	public Customer(String customerID, Name name)
	{
		customerID = this.customerID;
		this.name = name;
	//	this.rewardPoints = rewardPoints;
	}
	
	public void addRewardPoints(int rewardPoints)
	{
		int currentPoints = this.rewardPoints; 
		
		int newPoints = currentPoints + rewardPoints;
		
		this.rewardPoints = newPoints;
	}
	
	public int getRewardPoints()
	{
		return rewardPoints;
	}
	
	public String toString()
	{
		return "Customer: " + customerID + "name:" +  name.getFullName();
	}

}
