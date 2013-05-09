package edu.neumont.csc380.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="move")
public class Move {
	
	public Move(){}

	public Move(int row, int column){
		this.row = row;
		this.column = column;
	}
	
	@XmlElement(name="piece")
	private Piece piece;
	
	@XmlElement(name="column")
	private int column;
	
	@XmlElement(name="row")
	private int row;

	@XmlTransient
	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	@XmlTransient
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
}
