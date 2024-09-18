package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.Moveable;

public class LevelSetup {
	// Arraylist of interacting pieces
	ArrayList<GamePiece> interactingList = new ArrayList<>();
	// Arraylist of moving pieces
	ArrayList<Moveable> moveableList = new ArrayList<>();
	// Game board
	Drawable[] gameBoard = new Drawable[21];

	
	
	
	public void createLevel(int levelNum) {
		// TODO Auto-generated method stub
		// switch case to switch between level numbers
		// call level 1 and level 2 void methods
		switch(levelNum) {
		case 1:
			level1();
			break;
		case 2:
			level2();
		default:
			System.out.println("Level not available.");
			break;
		}
		
	}
	
	public LevelSetup() {
		interactingList.clear();
		moveableList.clear();
	}

	
	public void level1() {
		return;
	}
	
	public void level2() {
		return;
	}
	

	public Drawable[] getBoard() {
		// TODO Auto-generated method stub
		return gameBoard;
	}

	public ArrayList<Moveable> getMovingPieces() {
		// TODO Auto-generated method stub
		return moveableList;
	}

	public ArrayList<GamePiece> getInteractingPieces() {
		// TODO Auto-generated method stub
		return interactingList;
	}

	public int getPlayerStartLoc() {
		// TODO Auto-generated method stub
		return 0;
	}

}
