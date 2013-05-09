package edu.neumont.csc380.models;

import javax.xml.bind.annotation.XmlElement;

public class Board 
{
	@XmlElement(name="board")
	private String[][] board;
	
	public Board()
	{
		board = new String[3][3];
	}
	
	public String[][] getBoard() {
		return board;
	}
	
	public void setBoard(String[][] board) {
		this.board = board;
	}
	
	@Override
	public String toString()
	{
		String result = "";
		// Example toString(): (xoEMPTY),(xEMPTYo),(oEMPTYx)
		for(int row = 0; row < board.length; row++) {
			result += "(";
			for(int column = 0; column < board.length; column++) {
				result += board[row][column];
			}
			result += "),";
		}
		// Take out the extra comma at the end of result
		result.substring(result.length()).replace(",", "");
		
		return result;
	}
}
