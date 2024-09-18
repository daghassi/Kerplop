package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class DartBlower extends GamePiece{
	private int loc;
  private char sym;
  private String lab;
	public DartBlower(char symbol, String label, int location) {
		super(symbol, label, location);
		sym = symbol;
    lab = label;
		loc = getLocation();
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if (playerLocation < loc + 2 || playerLocation > loc - 2) {
      return InteractionResult.KILL;
    }
		return null;
	}
	
}
