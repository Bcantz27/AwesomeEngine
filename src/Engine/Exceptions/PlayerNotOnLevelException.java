package Engine.Exceptions;

public class PlayerNotOnLevelException extends Exception
{

	private static final long serialVersionUID = 1L;
	
	private String levelName;
	private String playerName;
	
	public PlayerNotOnLevelException(String levelName, String playerName)
	{
		this.levelName = levelName;
		this.playerName = playerName;
	}
	
	public String getMessage()
	{
		return (playerName + " was not found at " + levelName + ".");
	}
}
