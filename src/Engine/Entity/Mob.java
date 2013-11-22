package Engine.Entity;

public class Mob extends LivingEntity
{
	private boolean hostile;

	public Mob(String newName, int newId) {
		super(newName, newId, 0, 0,100,100,100);
		hostile = false;
	}
	
	public Mob(String newName, int newId, int newX, int newY, int maxHealth, int maxEnergy, int maxMana, boolean Hostility) {
		super(newName, newId, newX, newY,maxHealth,maxEnergy,maxMana);
		hostile = Hostility;
	}
	
	public Mob(String newName, int newId, int newX, int newY, int maxHealth, int maxEnergy, int maxMana) {
		super(newName, newId, newX, newY,maxHealth,maxEnergy,maxMana);
		hostile = false;
	}
	
	/* START setters and getters */
	
	public boolean isHostile()
	{
		return hostile;
	}
	
	public void setHostile(boolean hostile)
	{
		this.hostile = hostile;
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
