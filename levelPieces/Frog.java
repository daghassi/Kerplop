package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Frog extends GamePiece implements Moveable {
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
		return gameEngine.InteractionResult.NONE;
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
      int newLoc = 0;
      if (loc + 1 < gameBoard.length) {
        newLoc = loc + 1;
      }
      if (gameBoard[newLoc] == null) {
      gameBoard[newLoc] = gameBoard[loc];
      gameBoard[loc] = null;
      loc = newLoc;
    }
			return;

		}
	}


