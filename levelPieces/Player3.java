package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Player3 extends GamePiece{
	private int loc;
	public Player3(char symbol, String label, int location) {
		super(symbol, label, location);
		// TODO Auto-generated constructor stub
		loc = getLocation();
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		return null;
	}

}
