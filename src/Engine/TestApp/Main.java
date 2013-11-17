package Engine.TestApp;

import Engine.AwesomeEngine;
import Engine.Exceptions.ApplicationAlreadyExistsException;

public class Main extends AwesomeEngine
{
	protected Main() throws ApplicationAlreadyExistsException 
	{

	}

	private static boolean playing;
	private static int tickCount = 0;
	
	public static void main(String[] args) throws ApplicationAlreadyExistsException
	{
		Main gameMain = new Main();
		gameMain.start();
	}
	
	/* START setters and getters */
	public boolean Playing()
	{
		return playing;
	}
	
	public void setPlaying(boolean play)
	{
		playing = play;
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
	
	public void tick()
	{
		tickCount++;

	}

	public void render()
	{

	}
}
