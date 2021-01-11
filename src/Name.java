
public class Name {
	
	private String firstName;
	private String lastName;
	
	public Name()
	{
		firstName = "";
		lastName = "";
	}
	
	public Name(String firstName, String lastName)
	{
		firstName = this.firstName;
		lastName = this.lastName;
	}
	
	public String getFullName()
	{
		return firstName + lastName;
		
	}

}
