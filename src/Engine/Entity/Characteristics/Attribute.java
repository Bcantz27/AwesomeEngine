package Engine.Entity.Characteristics;

public class Attribute 
{
	private String name;
	private int level;
	private int xpToLvl;
	private int curXp;
	
	/* START Setters and Getters */
	
	public String getName()
	{
		return name;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public int getXpToLvl()
	{
		return xpToLvl;
	}
	
	public int getCurXp()
	{
		return curXp;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setLevel(int newLvl)
	{
		level = newLvl;
	}
	
	public void setXpToLvl(int xpLvl)
	{
		xpToLvl = xpLvl;
	}
	
	public void setCurXp(int newXp)
	{
		curXp = newXp;
	}
	
	/* END Setters and Getters */
}
