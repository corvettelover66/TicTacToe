package edu.neumont.csc380.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="game")
public class Game {
	
	public Game(){}
	
	@XmlElement(name="playerOne")
	private Player playerOne;
	
	@XmlElement(name="playerTwo")
	private Player playerTwo;
	
	@XmlElement(name="status")
	private GameStatusMessage currentStatus;
	
	@XmlTransient
	public Player getPlayerOne() {
		return playerOne;
	}

	public void setPlayerOne(Player playerOne) {
		this.playerOne = playerOne;
	}
	
	@XmlTransient
	public Player getPlayerTwo() {
		return playerTwo;
	}

	public void setPlayerTwo(Player playerTwo) {
		this.playerTwo = playerTwo;
	}
	
	@XmlTransient
	public GameStatusMessage getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(GameStatusMessage currentStatus) {
		this.currentStatus = currentStatus;
	}
	
}
