package Engine;

import Engine.Exceptions.ApplicationAlreadyExistsException;
import Engine.Exceptions.FrameAlreadyExistsException;
import Engine.Gui.MainFrame;

public abstract class AwesomeEngine implements Runnable
{
	private static AwesomeEngine instance;					/* Instance of this class (Singleton) */
	
	/**
	 * The constuctor for this class.
	 * @throws ApplicationAlreadyExistsException
	 */
	protected AwesomeEngine() throws ApplicationAlreadyExistsException
	{
		if (null == instance)
		{
			instance = this;
		} 
		else
		{
			throw new Engine.Exceptions.ApplicationAlreadyExistsException();
		}
		
		try 
		{
			MainFrame frame = new MainFrame();
			frame.start();
		} 
		catch (FrameAlreadyExistsException e) 
		{
			e.printStackTrace();
		}
	}
	
	/* START setters and getters */
	
	/**
	 * Returns the instance
	 * @return
	 */
	public AwesomeEngine getInstance()
	{
		return instance;
	}

	/* END setters and getters */
	
	@Override
	public abstract void run();
	
	/**
	 * Handles the game logic
	 */
	public abstract void tick();
	
	/**
	 * Renders the screen
	 */
	public abstract void render();

}
