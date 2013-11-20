package Engine.TestApp;

import Engine.AwesomeEngine;
import Engine.Exceptions.ApplicationAlreadyExistsException;
import Engine.Gui.MainFrame;

/**
 * @author Bryan
 * This is a Test driver for the Engine
 *
 */
public class Main extends AwesomeEngine
{
	private static boolean playing; 					/*  if this is true than the engine is running, otherwise the engine is idle. */
	private static int tickCount = 0;					/*  current tick count */
	
	/**
	 * Constuctor for this class
	 * @throws ApplicationAlreadyExistsException
	 */
	protected Main() throws ApplicationAlreadyExistsException 
	{

	}
	
	/**
	 * Main method
	 * @param args
	 * @throws ApplicationAlreadyExistsException
	 */
	public static void main(String[] args) throws ApplicationAlreadyExistsException
	{
		Main gameMain = new Main();
		MainFrame.getInstance().setName("AWESOME GAME - MADE WITH AWESOME ENGINE!");
		gameMain.start();
	}
	
	/* START setters and getters */
	/**
	 * Returns the state of playing
	 * @return playing
	 */
	public boolean isPlaying()
	{
		return playing;
	}
	
	/**
	 * Sets the state of playing
	 * @param playing
	 */
	public void setPlaying(boolean playing)
	{
		this.playing = playing;
	}
	/* END setters and getters */
	
	public synchronized void start()
	{
		playing = true;
		new Thread(this).start();
	}
	
	public synchronized void stop()
	{
		
	}
	
	/* (non-Javadoc)
	 * @see Engine.AwesomeEngine#run()
	 */
	public void run() 
	{
		long lastTime = System.nanoTime();
		long now;
		double nsPerTick = 1000000000D/60D;						//How many nano seconds in 60 ticks
		
		int ticks = 0;
		int frames = 0;
		
		long lastTimer = System.currentTimeMillis();
		double delta = 0;
		
		boolean shouldRender = false;
		
		while(playing)
		{
			now = System.nanoTime();
			delta += (now - lastTime)/nsPerTick;
			lastTime = now;
			
			while(delta >= 1)
			{
				ticks++;
				tick();
				delta -= 1;
				shouldRender = true;
			}
			
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(shouldRender)
			{
				frames++;
				render();
			}
			
			if(System.currentTimeMillis() - lastTimer >= 1000)
			{
				lastTimer += 1000;
				System.out.println("Frames: " + frames + " Ticks: " + ticks);
				frames = 0;
				ticks = 0;
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see Engine.AwesomeEngine#tick()
	 */
	public void tick()
	{
		tickCount++;

	}

	/* (non-Javadoc)
	 * @see Engine.AwesomeEngine#render()
	 */
	public void render()
	{

	}
}
