package Engine.World;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import Engine.Entity.Entity;
import Engine.Entity.Mob;
import Engine.Entity.Npc;
import Engine.Entity.Player;
import Engine.Exceptions.PlayerNotOnLevelException;

public class Level 
{
	private String name;
	private Map map = new Map(10,10);
	private List<Entity> entitiesOnLevel = new ArrayList<Entity>();
	private static Player player = new Player("Player");
	
	public Level()
	{
		this.name = "No Name";
	}
	
	public Level(String name)
	{
		this.name = name;
	}
	
	public Level(String name, int width, int height)
	{
		this.name = name;
		map = new Map(width,height);
	}
	
	/* START setters and getters */
	
	public String getName()
	{
		return name;
	}
	
	public Map getMap()
	{
		return map;
	}
	
	public Player getPlayer()
	{
		return player;
	}
	
	public List<Entity> getEntities()
	{
		return entitiesOnLevel;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/* END setters and getters */
	
	public void render(Graphics g)
	{
		//if(map == null) map.generateMap();
		map.renderIso(g);
	}
	
	public Player getPlayerNamed(String name) throws PlayerNotOnLevelException
	{
		Player player = null;
		
		for(Entity e: entitiesOnLevel)
		{
			if(e.getClass() == Player.class && e.Name() == name)
			{
				player = (Player)e;
			}
		}
		
		if(player == null) throw new PlayerNotOnLevelException(this.getName(), name);
		
		return player;
	}
	
	public List<Mob> getMobsWithId(int id)
	{
		List<Mob> mobs = new ArrayList<Mob>();
		
		for(Entity e: entitiesOnLevel)
		{
			if(e.getClass() == Mob.class && e.Id() == id)
			{
				mobs.add((Mob)e);
			}
		}
		
		return mobs;
	}
	
	public Npc getNpcWithId(int id)
	{
		Npc npc = null;
		
		for(Entity e: entitiesOnLevel)
		{
			if(e.getClass() == Npc.class && e.Id() == id)
			{
				npc = (Npc)e;
			}
		}
		
		return npc;
	}
	
	public List<Npc> getNpcsWithId(int id)
	{
		List<Npc> npcs = new ArrayList<Npc>();
		
		for(Entity e: entitiesOnLevel)
		{
			if(e.getClass() == Npc.class && e.Id() == id)
			{
				npcs.add((Npc)e);
			}
		}
		
		return npcs;
	}
	
	
}
