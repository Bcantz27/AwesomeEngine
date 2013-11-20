package Engine.World;

public class Map 
{
	private int mapWidth;
	private int mapHeight;
	private Tile[][] map;
	
	public Map(int width, int height)
	{
		mapWidth = width;
		mapHeight = height;
		map = new Tile[width][height];
	}
	
	public int getWidth()
	{
		return mapWidth;
	}
	
	public int getHeight()
	{
		return mapHeight;
	}
	
	public Tile getTile(int x, int y)
	{
		if(x < 0) x = 0;
		if(y < 0) y = 0;
		if(y > mapHeight) y = mapHeight;
		if(x > mapWidth) x = mapWidth;
		
		return map[x][y];
	}
	
	public void setTile(Tile t, int x, int y)
	{
		if(x < 0) x = 0;
		if(y < 0) y = 0;
		if(y > mapHeight) y = mapHeight;
		if(x > mapWidth) x = mapWidth;
		
		map[x][y] = t;
	}
	
}
