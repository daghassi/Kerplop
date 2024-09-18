package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Player;

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
    if (playerLocation == loc) {
      return gameEngine.InteractionResult.HIT;
    }
	}

}
