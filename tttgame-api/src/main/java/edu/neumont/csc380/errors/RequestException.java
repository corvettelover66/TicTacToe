package edu.neumont.csc380.errors;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "requestException")
public class RequestException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2099883131217824184L;
	@XmlElement(name="message")
	private static String message = "Something went wrong with the request. Please try again.";

	public RequestException()
	{
		super(message);
	}
}
