package Engine.Entity;

import Engine.Entity.Characteristics.Vital;
import Engine.Entity.Items.Inventory;

public class LivingEntity extends Entity 
{
	protected boolean alive;
	protected Inventory inventory;
	
	private Vital health;
	private Vital energy;
	private Vital mana;
	
	public LivingEntity()
	{
		alive = true;
		inventory = new Inventory();
	}
	
	public LivingEntity(String newName, int newId, int newX, int newY, int maxHealth, int maxEnergy, int maxMana)
	{
		super(newName, newId, newX, newY);
		alive = true;
		inventory = new Inventory();
		health = new Vital("Health", maxHealth, maxHealth);
		energy = new Vital("Energy", maxEnergy, maxEnergy);
		mana = new Vital("Mana", maxMana, maxMana);
	}
	
	/* START setters and getters */
	
	public boolean isAlive()
	{
		return alive;
	}
	
	public Inventory getInventory()
	{
		return inventory;
	}
	
	public void setAlive(boolean alive)
	{
		this.alive = alive;
	}
	
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

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}
	
	/* END setters and getters */
}
