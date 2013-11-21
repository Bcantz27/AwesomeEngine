package Engine.Entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Engine.Gfx.Animator;
import Engine.World.Position;

public abstract class Entity 
{
	protected String name;
	protected int id;
	protected Position position = new Position();
	protected BufferedImage image;
	
	protected Animator animator = new Animator(2);
	// 0 = Idle
	// 1 = Walk
	
	public Entity()
	{
		position.setPosition(0, 0);
		name = "No Name";
		id = 0;
		//image = LoadImageOfEntity(id);
	}
	
	public Entity(String newName, int newId, int newX, int newY)
	{
		position.setPosition(newX, newY);
		name = newName;
		id = newId;
		//image = LoadImageOfEntity(newId);
	}
	
	/* START setters and getters */
	
	public int Id()
	{
		return id;
	}
	
	public String  Name()
	{
		return name;
	}
	
	public Animator getAnimator()
	{
		return animator;
	}
	
	public Position getPosition()
	{
		return position;
	}
	
	public BufferedImage getImage()
	{
		return image;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setId(int newId)
	{
		id = newId;
	}
	
	public void setPosition(Position pos)
	{
		position = pos;
	}
	
	/* END setters and getters */
	
	@SuppressWarnings("unused")
	private BufferedImage LoadImageOfEntity(int id)
	{
		BufferedImage newImage = null;
		
		switch(id)
		{
			case 0:
				try {
					newImage = ImageIO.read(new File("filename.png"));
				} catch (IOException e) {
					e.printStackTrace();
				}
			break;
		}
		
		return newImage;
	}
}
