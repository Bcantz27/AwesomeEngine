package Engine.Gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Engine.World.Level;

public class GamePane extends JPanel
{	
	private static final long serialVersionUID = 1L;
	public static JLabel view;
	public static BufferedImage game;
	public static Level CurrentLevel;

	public GamePane()
	{
		CurrentLevel = new Level("Temp Level",100,100);
		this.setOpaque(false);
		game = new BufferedImage(MainFrame.getInstance().getWidth(),MainFrame.getInstance().getHeight(),BufferedImage.TYPE_INT_RGB);
		view = new JLabel(new ImageIcon(game));
		Graphics g = game.getGraphics();
		
		this.setLayout(new BorderLayout());
		this.add(view, BorderLayout.CENTER);
		
		g.dispose();
	}
	
	public static void render()
	{
		Graphics g = game.getGraphics();
		
		CurrentLevel.render(g);
		
		g.dispose();
		view.repaint();
	}

}
