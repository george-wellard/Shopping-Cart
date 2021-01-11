
public class Date {
	
	private int day;
	private int month;
	private int year;
	
	public Date()
	{
		day = 0;
		month = 0;
		year = 0;
	}

	public Date(int day, int month, int year)
	{
		day = this.day;
		month = this.month;
		year = this.year;
	}
	
	public String getDateString()
	{
		return "Day: " + day + " Month: " + month + " Year: " + year;
	}

}
