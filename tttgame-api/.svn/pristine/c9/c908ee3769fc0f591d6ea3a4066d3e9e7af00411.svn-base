package edu.neumont.csc380.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="player")
public class Player {
	
	public Player(){}
	
	public Move makeMove(int row, int col)
	{
		return new Move(row, col);
	}
	
	@XmlElement(name="publicKey")
	private Key publicKey;

	@XmlTransient
	public Key getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(Key publicKey) {
		this.publicKey = publicKey;
	}
}
