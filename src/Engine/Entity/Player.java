package Engine.Entity;

import Engine.Entity.Characteristics.Vital;
import Engine.Gfx.Animator;

public class Player extends Entity
{
	private Vital health;
	private Vital energy;
	private Vital mana;
	
	private Animator animator = new Animator(2);
	// 0 = Idle
	// 1 = Walk

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
