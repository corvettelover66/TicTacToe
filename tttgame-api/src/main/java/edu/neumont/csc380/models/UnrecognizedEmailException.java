package edu.neumont.csc380.models;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.ws.WebFault;

@WebFault(name = "UnrecognizedEmailException")
@XmlRootElement(name = "UnrecognizedEmailException")
public class UnrecognizedEmailException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public UnrecognizedEmailException(String message)
	{
		super(message);
	}
}
