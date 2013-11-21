package Engine.Entity;

import Engine.Entity.Characteristics.Vital;

public class Npc extends LivingEntity
{
	private Vital health = new Vital("Health", 100, 100);
	private String[] dialog;

	public Npc(String newName, int newId) {
		super(newName, newId, 0, 0);
	}
	
	public Npc(String newName, int newId, int newX, int newY) {
		super(newName, newId, newX, newY);
	}

/* START setters and getters */
	
	public Vital Health()
	{
		return health;
	}
	
	/* END setters and getters */
	
	
	public static Npc getNpcByID(int id)
	{
		return PremadeNpcs.values()[id].getNPC();
	}
	
	public static enum PremadeNpcs
	{
		ShopKeeper{
			@Override
			public Npc getNPC()
			{
				return new Npc("Shopkeeper", 0);
			}
		},
		Nurse{
			@Override
			public Npc getNPC()
			{
				return new Npc("Nurse", 1);
			}
		};
		
		public abstract Npc getNPC();
	}
}
