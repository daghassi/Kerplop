package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Chest extends GamePiece{
		private int loc;
    private char sym;
    private String lab;
	public Chest(char symbol, String label, int location) {
		super(symbol, label, location);
		sym = symbol;
    lab = label;
		loc = getLocation();
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
    if (playerLocation == loc) {
      return InteractionResult.GET_POINT;
    }
		return null;
	}

}
