package edu.neumont.csc380.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @authors Marlo Castro, Josh Jones, Douglas Romines, Curtis Knox
 * The Board class contains the 2D array of Strings where the moves
 * are made.
 * tiles is the 2D array of Strings of size 3 by 3. 
 *
 */
@XmlRootElement(name="board")
public class Board 
{
	@XmlElement(name="tiles")
	private String[][] tiles;
	
	public Board() {}
	
	public Board(String[][] board)
	{
		tiles = new String[3][3];
		for(int row = 0; row < tiles.length; row++) {
			for(int column = 0; column < tiles.length; column++) {
				tiles[row][column] = Piece.E.toString();
			}
		}
	}
	
	public String[][] getTiles() {
		return tiles;
	}
	
	public void setTiles(String[][] board) {
		this.tiles = board;
	}
	
	@Override
	public String toString()
	{
		String result = "";
		// Example toString(): x,E,o,o,E,E,x,E,x
		for(int row = 0; row < tiles.length; row++) {
			for(int column = 0; column < tiles.length; column++) {
				result += tiles[row][column] + ",";
			}
		}
		// Take out the extra comma at the end of result
		result.substring(result.length()).replace(",", "");
		
		return result;
	}
}
