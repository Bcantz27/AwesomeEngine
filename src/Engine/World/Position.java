package Engine.World;

public class Position 
{
	private float x = 0;
	private float y = 0;
	private float isoX = x - y;
	private float isoY = (x + y) / 2;
	private float screenX;
	private float screenY;
	
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
		screenX = (isoX - isoY) * 64;
		screenY = (isoX + isoY) * 16;
	}
	
	/* START Setters and Getters */
	
	public float getCartX()
	{
		return x;
	}
	
	public float getCartY()
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
	
	public float getScreenX()
	{
		return screenX;
	}
	
	public float getScreenY()
	{
		return screenY;
	}
	
	public void setPosition(float newX, float newY)
	{
		x = newX;
		y = newY;
		isoX = x - y;
		isoY = (x + y) / 2;
		screenX = (isoX - isoY) * 64;
		screenY = (isoX + isoY) * 16;
	}
	
	/* END Setters and Getters */
	
	public void shiftPosition(float shiftX, float shiftY)
	{
		x += shiftX;
		y += shiftY;
		isoX = x - y;
		isoY = (x + y) / 2;
		screenX = (isoX - isoY) * 64;
		screenX = (isoX + isoY) * 16;
	}
	
	public boolean compare(Position pos)
	{
		if(pos.getCartX() == x && pos.getCartY() == y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
