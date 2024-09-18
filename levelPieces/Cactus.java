package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Cactus extends GamePiece{
		private int loc;
    private char sym;
    private String lab;
	public Cactus(char symbol, String label, int location) {
		super(symbol, label, location);
		sym = symbol;
    lab = label;
		loc = getLocation();
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
    if (Player.getLocation() == loc) {
      InteractionResult.HIT;
    }
		return null;
	}

}
