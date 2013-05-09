package edu.neumont.csc380.errors;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "gameErrorException")
public class GameErrorException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2099883131217824184L;
	@XmlElement(name="message")
	private static String message = "The game you are trying to access does not exist or may have already ended.";

	public GameErrorException()
	{
		super(message);
	}
}
