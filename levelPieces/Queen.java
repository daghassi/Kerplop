package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import java.lang.Math;

public class Queen extends GamePiece{
		private int loc;
		private char sym;
		private String lab;
	public Queen(char symbol, String label, int location) {
		super(symbol, label, location);
		// TODO Auto-generated constructor stub
		loc = getLocation();
		sym = symbol;
		lab = label;
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(Math.abs(playerLocation - loc) == 1){
			System.out.println("You have Reached the Queen!");
		}
		return InteractionResult.ADVANCE;
	}

}
