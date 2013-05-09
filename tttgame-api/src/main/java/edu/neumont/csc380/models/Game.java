package edu.neumont.csc380.models;

import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 
 * @authors Marlo Castro, Josh Jones, Douglas Romines, Curtis Knox
 * The Game class is given a random unique ID when instantiated.
 * It contains a Board object, Player one and Player two objects,
 * and a GameStatusMessage.
 */
@XmlRootElement(name="game")
public class Game {
	
	public Game(){
		this.id = UUID.randomUUID().toString();	
	}
	Board board = new Board();
	
	@XmlElement(name="id")
	private String id;
	
	@XmlElement(name="playerOne")
	private Player playerOne;
	
	@XmlElement(name="playerTwo")
	private Player playerTwo;
	
	@XmlElement(name="status")
	private GameStatusMessage currentStatus;
	
	public Game newGame()
	{
		return new Game();
	}
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
}
