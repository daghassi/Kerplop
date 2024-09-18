package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Lilypad implements Drawable{
	private int loc;
  private char sym;
  private String lab;
	public Lilypad(char symbol, String label, int location) {
	  	loc = location;
      sym = symbol;
      lab = label;
  }

  @Override
  public void draw() {
    System.out.print(sym);
  }


}
