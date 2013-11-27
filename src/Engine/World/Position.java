package Engine.World;

public class Position 
{
	private float x = 0;
	private float y = 0;
	private float isoX = x - y;
	private float isoY = (x + y) / 2;
	
	public Position()
	{
		x = 0;
		y = 0;
	}
	
	public Position(float newX, float newY)
	{
		x = newX;
		y = newY;
		isoX = x - y;
		isoY = (x + y) / 2;
	}
	
	/* START Setters and Getters */
	
	public float getX()
	{
		return x;
	}
	
	public float getY()
	{
		return y;
	}
	
	public float getIsoX()
	{
		return isoX;
	}
	
	public float getIsoY()
	{
		return isoY;
	}
	
	public void setPosition(float newX, float newY)
	{
		x = newX;
		y = newY;
		isoX = x - y;
		isoY = (x + y) / 2;
	}
	
	/* END Setters and Getters */
	
	public void shiftPosition(float shiftX, float shiftY)
	{
		x += shiftX;
		y += shiftY;
		isoX = x - y;
		isoY = (x + y) / 2;
	}
	
	public boolean compare(Position pos)
	{
		if(pos.getX() == x && pos.getY() == y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
