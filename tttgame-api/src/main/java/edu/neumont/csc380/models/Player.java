package edu.neumont.csc380.models;

import java.security.PublicKey;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="player")
public class Player {
	
	@XmlElement(name="id")
	private PublicKey id;
	
	@XmlElement(name="type")
	private char type;
	
	public Player(PublicKey id, char type){
		this.id = id;
		this.type = type;
	}
	
	public Move makeMove(int row, int col){
		return new Move(row, col);
	}

	@XmlTransient
	public char getType() {
		return type;
	}
	@XmlTransient
	public PublicKey getId() {
		return id;
	}
}
