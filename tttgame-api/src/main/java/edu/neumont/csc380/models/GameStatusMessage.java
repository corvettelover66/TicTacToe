package edu.neumont.csc380.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="gameStatusMessage")
public class GameStatusMessage {
	
	@XmlElement(name="player")
	private Player currentPlayer;
	
	@XmlElement(name="board")
	private Board board;
	
	@XmlElement(name="game")
	private Game game;
	
	public GameStatusMessage(){
		board = new Board();
	}
	public Player start(Game game)
	{
		game.getBoard().toString();
		// TODO: Return an actual player
		return currentPlayer;
	}
	public void move(Move move, Player player)
	{
//		if(!player.isTurn())
//		{
//			throw new NotYourTurnException();
//		}
//		else
//		{
//			// TODO: add the move to the board
//		}
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
