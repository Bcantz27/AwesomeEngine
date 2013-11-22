package Engine.Gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePane extends JPanel
{	
	public static JLabel view;
	public static BufferedImage game;

	public GamePane()
	{
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
		
		view.repaint();
		g.dispose();
	}

}
