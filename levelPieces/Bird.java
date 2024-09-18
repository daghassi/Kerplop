package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Bird extends GamePiece implements Moveable {
	private int loc;
  private char sym;
  private String lab;
	public Bird(char symbol, String label, int location) {
		super(symbol, label, location);
		sym = symbol;
    lab = label;
		loc = getLocation();
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
            if (playerLocation == loc) {
        return InteractionResult.HIT;
      }
		return null;
	}

  @Override
  public void move(Drawable[] gameBoard, int playerLocation) {
    int direction = 1;
      if(gameBoard[loc + 2] != null) {
        loc += (2 * direction);
      } else {
          direction = -1;
      }


  }

}
