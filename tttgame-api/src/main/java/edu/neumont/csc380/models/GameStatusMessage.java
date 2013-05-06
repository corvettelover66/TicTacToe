package edu.neumont.csc380.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

public class GameStatusMessage {
	
	public GameStatusMessage(){}
	
	@XmlElement(name="player")
	private Player player;
	
	@XmlElement(name="moves")
	private boolean[][] moves;

	@XmlTransient
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	@XmlTransient
	public boolean[][] getMoves() {
		return moves;
	}

	public void setMoves(boolean[][] moves) {
		this.moves = moves;
	}
}
