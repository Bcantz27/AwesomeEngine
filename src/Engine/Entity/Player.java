package Engine.Entity;

public class Player extends LivingEntity
{
	private static final int STARTING_X = 0;
	private static final int STARTING_Y = 0;
	private static final int STARTING_MAXHEALTH = 100;
	private static final int STARTING_MAXENERGY = 100;
	private static final int STARTING_MAXMANA = 100;
	
	public Player(String newName) 
	{
		super(newName, -1, STARTING_X, STARTING_Y, STARTING_MAXHEALTH, STARTING_MAXENERGY, STARTING_MAXMANA);
		
	}
	
	public Player(String newName, int newId, int newX, int newY,int maxHealth, int maxEnergy, int maxMana) 
	{
		super(newName, newId, newX, newY,maxHealth,maxEnergy, maxMana);
		
	}
	
	/* START Setters and Getters */
	
	/* END setters and getters */

}
