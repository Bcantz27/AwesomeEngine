package Engine;

import java.awt.Dimension;

import javax.swing.JFrame;

import Engine.Exceptions.ApplicationAlreadyExistsException;

public abstract class AwesomeEngine implements Runnable
{
	private static final long serialVersionUID = 1L;
	
	private static final int WIDTH = 128;
	private static final int HEIGHT = WIDTH/12*9;
	private static final int SCALE = 8;
	public static final String NAME = "Insert Name Here";

	private static AwesomeEngine instance;
	
	protected AwesomeEngine() throws ApplicationAlreadyExistsException
	{
		if (null == instance)
		{
			instance = this;
		} else
		{
			throw new Engine.Exceptions.ApplicationAlreadyExistsException();
		}
		
		JFrame frame = new JFrame(NAME);
		
		frame.setMinimumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
        frame.setMaximumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
        frame.setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		frame.pack();
	}
	
	/* START setters and getters */
	
	public AwesomeEngine getInstance()
	{
		return instance;
	}
	
	public int getWidth()
	{
		return WIDTH*SCALE;
	}
	
	public static int getHeight()
	{
		return HEIGHT*SCALE;
	}

	/* END setters and getters */
	
	@Override
	public abstract void run();
	
	public abstract void tick();
	
	public abstract void render();

}
