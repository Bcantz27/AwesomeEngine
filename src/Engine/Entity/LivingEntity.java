package Engine.Entity;

public class LivingEntity extends Entity 
{
	protected boolean alive;
	
	public LivingEntity()
	{
		alive = true;
	}
	
	public LivingEntity(String newName, int newId, int newX, int newY)
	{
		super(newName, newId, newX, newY);
		alive = true;
	}
	
	/* START setters and getters */
	
	public boolean isAlive()
	{
		return alive;
	}
	
	public void setAlive(boolean alive)
	{
		this.alive = alive;
	}
	
	/* END setters and getters */
}
