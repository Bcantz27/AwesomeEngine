package Engine.Gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import Engine.World.Tile;

public class TileSheet
{
	
	public static TileSheet flatTiles = new TileSheet("/FlatTiles.png",64,32);
	
	public String path;
	public int width;
	public int height;
	public int tileWidth;
	public int tileHeight;
	
	public int[] pixels;
	public Tile[][] tiles;
	
	public TileSheet(String path, int tileWidth, int tileHeight)
	{
		this.tileWidth = tileWidth;
		this.tileHeight = tileHeight;
		
		BufferedImage image = null;
		
		try {
			image = ImageIO.read(TileSheet.class.getResourceAsStream(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(image == null)
		{
			return;
		}
		
		this.path = path;
		this.width = image.getWidth();
		this.height = image.getHeight();
		tiles = new Tile[width/tileWidth][height/tileHeight];
		
		pixels = image.getRGB(0, 0, width, height, null, 0, width);
		
		for(int i = 0; i < pixels.length; i ++)
		{
			pixels[i] = (pixels[i] & 0xff)/64;
		}
		
		loadTileSheet(image);
	}
	
	private void loadTileSheet(BufferedImage image)
	{	
		for(int i = 0; i < height/tileHeight;i++)
		{
			for(int j = 0; j < width/tileWidth ; j++)
			{
				tiles[i][j] = new Tile(i,image.getSubimage(i*tileWidth, j*tileHeight, tileWidth, tileHeight));
			}
		}
	}
}
