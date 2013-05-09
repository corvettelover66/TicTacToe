package edu.neumont.csc380.models;

import java.security.PublicKey;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "player")
public class Player {

	@XmlElement(name = "id")
	private PublicKey id;
	
	/*
	 * Represents whether a player uses an X or an O for its moves
	 * No need to include this in the XML
	 */
	private Piece piece;

	public Player(PublicKey id) {
		this.id = id;
	}
	
	public Move makeMove(int row, int col) {
		return new Move(row, col);
	}

	@XmlTransient
	public Piece getPiece() {
		return piece;
	}
	
	@XmlTransient
	public void setPiece(Piece piece) {
		this.piece = piece; 
	}
	
	@XmlTransient
	public PublicKey getId() {
		return id;
	}
}
