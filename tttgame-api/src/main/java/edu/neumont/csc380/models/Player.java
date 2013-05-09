package edu.neumont.csc380.models;

import java.security.PublicKey;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "player")
public class Player {

	@XmlElement(name = "id")
	Piece piece;
	private PublicKey id;

	public Player(PublicKey id, Piece piece) {
		this.id = id;
		this.piece = piece;
	}

	public Move makeMove(int row, int col) {
		return new Move(row, col);
	}

	@XmlTransient
	public PublicKey getId() {
		return id;
	}
}
