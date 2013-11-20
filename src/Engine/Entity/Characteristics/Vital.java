package Engine.Entity.Characteristics;

public class Vital 
{
	private String name;
	private int maxAmount;
	private int curAmount;
	
	public Vital(String newName, int maxAmt, int curAmt)
	{
		name = newName;
		maxAmount = maxAmt;
		curAmount = curAmt;
	}
	
	/* START Setters and Getters */
	
	public String Name()
	{
		return name;
	}
	
	public int MaxAmount()
	{
		return maxAmount;
	}
	
	public int CurAmount()
	{
		return curAmount;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setMaxAmount(int amount)
	{
		maxAmount = amount;
	}
	
	public void setCurAmount(int amount)
	{
		curAmount = amount;
	}
	
	/* END setters and getters */
}
