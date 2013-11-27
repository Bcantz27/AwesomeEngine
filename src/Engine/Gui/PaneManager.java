package Engine.Gui;

import java.awt.Dimension;

import javax.swing.JLayeredPane;

public class PaneManager extends JLayeredPane 
{
	private static final long serialVersionUID = 1L;
	public static HUDPane HUD = new HUDPane();
	public static GamePane game = new GamePane();
	
	public PaneManager()
	{
		this.setOpaque(false);
		this.setPreferredSize(new Dimension(MainFrame.getInstance().getWidth(),MainFrame.getInstance().getHeight()));
		
		game.setPreferredSize(new Dimension(MainFrame.getInstance().getWidth(),MainFrame.getInstance().getHeight()));
		HUD.setPreferredSize(new Dimension(MainFrame.getInstance().getWidth(),MainFrame.getInstance().getHeight()));
		
		game.setBounds(0,0,MainFrame.getInstance().getWidth(),MainFrame.getInstance().getHeight());
		HUD.setBounds(0,0,MainFrame.getInstance().getWidth(),MainFrame.getInstance().getHeight());
		
		this.add(game, JLayeredPane.DEFAULT_LAYER);
		this.add(HUD, JLayeredPane.PALETTE_LAYER);
	}
	
}
