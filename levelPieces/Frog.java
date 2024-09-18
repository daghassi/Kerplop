package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Frog extends GamePiece{
	private int loc;
	private char sym;
	private String lab;
	public Frog(char symbol, String label, int location) {
		super(symbol, label, location);
		loc = location;
		lab = label;
		sym = symbol;
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		boolean openSpace = false;
		while(!openSpace) {
		if(gameBoard[loc++] == null) {
			// moves frog to next open spot
			openSpace = true;
		}
		else if (gameBoard[loc + 2] == null){
			// moves frog to next open spot
			openSpace = true;
		}
		
	}
		return gameEngine.InteractionResult.NONE;
	}
}


