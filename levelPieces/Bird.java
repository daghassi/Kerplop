package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Bird extends GamePiece implements Moveable{
	private int loc;
	public Bird(char symbol, String label, int location) {
		super(symbol, label, location);
		
		loc = getLocation();
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
      private int direction = 1;
      if(gameBoard[loc + 2] != null) {
        loc += (2 * direction);
      } else {
          direction = -1;
      }
		return gameEngine.InteractionResult.HIT;
	}

}
