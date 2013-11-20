package Engine.Entity;

import Engine.Entity.Characteristics.Vital;

public class Player extends Entity
{
	private Vital health;
	private Vital energy;
	private Vital mana;
	
	public Player(String newName, int newId, int newX, int newY,int maxHealth, int maxEnergy, int maxMana) {
		super(newName, newId, newX, newY);
		health = new Vital("Health", maxHealth, maxHealth);
		energy = new Vital("Energy", maxEnergy, maxEnergy);
		mana = new Vital("Mana", maxMana, maxMana);
	}
	
	/* START Setters and Getters */
	
	public Vital Health()
	{
		return health;
	}
	
	public Vital Energy()
	{
		return energy;
	}
	
	public Vital Mana()
	{
		return mana;
	}
	
	/* END setters and getters */

}
