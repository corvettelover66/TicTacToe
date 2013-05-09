package edu.neumont.csc380.errors;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "notYourTurnException")
public class NotYourTurnException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2099883131217824184L;
	@XmlElement(name="message")
	private static String message = "It is not your turn yet!";

	public NotYourTurnException()
	{
		super(message);
	}
}
