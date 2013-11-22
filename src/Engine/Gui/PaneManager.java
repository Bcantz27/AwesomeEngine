package Engine.Gui;

import java.awt.Dimension;

import javax.swing.JLayeredPane;

public class PaneManager extends JLayeredPane 
{
	public static HUDPane HUD = new HUDPane();
	public static GamePane game = new GamePane();
	
	
	public PaneManager()
	{
		this.setOpaque(false);
		this.setPreferredSize(new Dimension(MainFrame.getInstance().getWidth(),MainFrame.getInstance().getHeight()));
		this.add(game, JLayeredPane.DEFAULT_LAYER);
		this.add(HUD, JLayeredPane.PALETTE_LAYER);
	}
	
}
