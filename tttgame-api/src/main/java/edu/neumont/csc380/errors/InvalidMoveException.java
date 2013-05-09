package edu.neumont.csc380.errors;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "invalidMoveException")
public class InvalidMoveException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2099883131217824184L;
	@XmlElement(name="message")
	private static String message = "The move you are trying to make is invalid.";

	public InvalidMoveException()
	{
		super(message);
	}
}
