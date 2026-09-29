package model;

public class Square {
	private final int row;
	private final int col;
	private Piece piece;
	private Color color;
	
	public Square(int row, int col, Piece p, Color c) {
		this.row=row;
		this.col=col;
		this.piece=p;
		this.color=c;
	}
	
	public void setPiece(Piece p) {
		this.piece=p;
	}
	
	public Piece getPiece() {
		return this.piece;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public int getCol() {
		return this.col;
	}
	
	public Color getColor() {
		return this.color;
	}
}


