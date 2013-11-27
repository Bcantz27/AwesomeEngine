package Engine.World;

import java.awt.Graphics;

import Engine.Gfx.TileSheet;
import Engine.Gui.GamePane;
import Engine.Gui.MainFrame;

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
		generateMap();
	}
	
	/* START setters and getters */
	
	public int getWidth()
	{
		return mapWidth;
	}
	
	public int getHeight()
	{
		return mapHeight;
	}
	
	/* END setters and getters */
	
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
	
	public void generateMap()
	{
		for(int i = 0; i < mapHeight; i++)//COLS
        {
            for(int j = 0; j < mapWidth; j++)//ROWS
            {
            	map[i][j] = TileSheet.flatTiles.tiles[0][0];
            }
        }
	}
	
	public void renderIso(Graphics g)
	{
		Position playerPos = GamePane.CurrentLevel.getPlayer().getPosition();
		
		int screenX = 0;
		int screenY = 0;
		int tileWidth = TileSheet.flatTiles.tileWidth;
		int tileHeight = TileSheet.flatTiles.tileHeight;
		int xLowerBound = (int) playerPos.getX()/tileWidth - (MainFrame.getInstance().getWidth())/tileWidth;
		int xUpperBound = (int) playerPos.getX()/tileWidth + (MainFrame.getInstance().getWidth())/tileWidth;
		int yLowerBound = (int) playerPos.getY()/tileHeight - (MainFrame.getInstance().getHeight())/tileHeight;
		int yUpperBound = (int) playerPos.getY()/tileHeight + (MainFrame.getInstance().getHeight())/tileHeight;
		
		int xOffset = (int) (MainFrame.getInstance().getWidth()/2) - tileWidth/2;
		int yOffset = (int) (MainFrame.getInstance().getHeight()/2) - tileHeight/2;
		
		if(xLowerBound < 0) xLowerBound = 0;
		if(yLowerBound < 0) yLowerBound = 0;
		if(xUpperBound > mapWidth) xUpperBound = mapWidth;
		if(yUpperBound > mapHeight) yUpperBound = mapHeight;
		
		System.out.println("xLower: " + xLowerBound + " xUpper: " + xUpperBound + " yLower: " + yLowerBound + " yUpper: " + yUpperBound);
		
		for(int i = 0; i < mapWidth; i++)		//COLS
        {
            for(int j = 0; j < mapHeight; j++)	//ROWS
            {
            	screenX = xOffset+ i * (tileWidth/2) - j * (tileWidth/2);
            	screenY = yOffset + i * (tileHeight/2) + j * (tileHeight/2);
                g.drawImage(map[i][j].getImage(), screenX, screenY, tileWidth, tileHeight, null);
            }
        }
	}
}
