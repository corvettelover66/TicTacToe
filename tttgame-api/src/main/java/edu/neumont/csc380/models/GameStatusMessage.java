package edu.neumont.csc380.models;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="gameStatusMessage")
public class GameStatusMessage {
	
	@XmlElement(name="player")
	private Player currentPlayer;
	
	@XmlElement(name="board")
	private Board board;
	
	public GameStatusMessage(){
		board = new Board();
	}
	
	@XmlTransient
	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	
	@XmlTransient
	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
}
