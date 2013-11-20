package Engine.Entity;

import Engine.Entity.Characteristics.Vital;

public class Mob extends Entity
{
	private Vital health;
	private Vital energy;
	private Vital mana;
	private boolean hostile;

	public Mob(String newName, int newId) {
		super(newName, newId, 0, 0);
		hostile = false;
		health = new Vital("Health", 100, 100);
		energy = new Vital("Energy", 100, 100);
		mana = new Vital("Mana", 100, 100);
	}
	
	public Mob(String newName, int newId, int newX, int newY, int maxHealth, int maxEnergy, int maxMana, boolean Hostility) {
		super(newName, newId, newX, newY);
		hostile = Hostility;
		health = new Vital("Health", maxHealth, maxHealth);
		energy = new Vital("Energy", maxEnergy, maxEnergy);
		mana = new Vital("Mana", maxMana, maxMana);
	}
	
	public Mob(String newName, int newId, int newX, int newY, int maxHealth, int maxEnergy, int maxMana) {
		super(newName, newId, newX, newY);
		hostile = false;
		health = new Vital("Health", maxHealth, maxHealth);
		energy = new Vital("Energy", maxEnergy, maxEnergy);
		mana = new Vital("Mana", maxMana, maxMana);
	}
	
/* START setters and getters */
	
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
	
	public boolean isHostile()
	{
		return hostile;
	}
	
	/* END setters and getters */
	
	public static Mob getMobByID(int id)
	{
		return PremadeMobs.values()[id].getMob();
	}
	
	public static enum PremadeMobs
	{
		Boar{
			@Override
			public Mob getMob()
			{
				return new Mob("Boar", 0);
			}
		},
		Snake{
			@Override
			public Mob getMob()
			{
				return new Mob("Snake", 1);
			}
		};
		
		public abstract Mob getMob();
	}
}
