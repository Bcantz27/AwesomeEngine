package Engine.Gui;

import java.awt.Dimension;

import javax.swing.JFrame;

import Engine.Exceptions.FrameAlreadyExistsException;

public class MainFrame extends JFrame
{
	private static final long serialVersionUID = 1L;
		
	private static int WIDTH = 256;						/* Width of the frame */
	private static int HEIGHT = WIDTH/12*9;				/* Height of the frame */
	private static int SCALE = 5;						/* Scale of the frame */
	private static String NAME = "Insert Name Here";	/* Name of the frame */
	
	private static MainFrame instance;					/* Instance of this class (Singleton) */
	
	public MainFrame() throws FrameAlreadyExistsException
	{
		if (null == instance)
		{
			instance = this;
		} 
		else
		{
			throw new Engine.Exceptions.FrameAlreadyExistsException();
		}
	}
	
	/* START setters and getters */
	
	/**
	 * Returns the instance
	 * @return
	 */
	public static MainFrame getInstance()
	{
		return instance;
	}
	
	public int getScale()
	{
		return SCALE;
	}
	
	public String getName()
	{
		return NAME;
	}
	
	/**
	 * Returns the width of the frame
	 * @return 
	 */
	public int getWidth()
	{
		return WIDTH*SCALE;
	}
	
	/**
	 * Returns the Height of the frame
	 * @return
	 */
	public int getHeight()
	{
		return HEIGHT*SCALE;
	}
	
	public void setName(String name)
	{
		this.NAME = name;
		this.setTitle(NAME);
	}
	
	public void setScale(int scale)
	{
		this.SCALE = scale;
	}

	/* END setters and getters */
	
	public void start()
	{
		setMinimumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
        setMaximumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
        setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		setVisible(true);
		pack();
	}
}
