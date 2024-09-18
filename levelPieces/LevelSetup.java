package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;

public class LevelSetup {
	// Arraylist of interacting pieces
	ArrayList<GamePiece> interactingList = new ArrayList<>();
	// Arraylist of moving pieces
	ArrayList<Moveable> moveableList = new ArrayList<>();
	// Game board
	Drawable[] gameBoard  = new Drawable[GameEngine.BOARD_SIZE];

	
	
	
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
		Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		interactingList.clear();
		moveableList.clear();
	}

	
	public void level1() {
		
		System.out.println(" ");
		System.out.println("Level 1: Legend");
		
		
		Lilypad l1 = new Lilypad('L', "Does nothing", 1);
		moveableList.clear();
		gameBoard[1] = l1;
		
		Frog f1 = new Frog('F', "Jumps one square at a time can jump jump over any obstacle", 2);
		moveableList.clear();
		gameBoard[f1.getLocation()] = f1;
		
		DartBlower d1 = new DartBlower('D', "If there are two spaces or closer it will shoot and kill", 9);
		moveableList.clear();
		gameBoard[d1.getLocation()] = d1;
		
		Chest c1 = new Chest('C', "Gives a point", 14);
		moveableList.clear();
		gameBoard[c1.getLocation()] = c1;
		
		Queen q1 = new Queen('Q', "When arrived at the Queen the player advances", 5);
		moveableList.clear();
		gameBoard[q1.getLocation()] = q1;
		
		Cactus ca1 = new Cactus('A', "Hits the player when they step on it", 6);
		moveableList.clear();
		gameBoard[ca1.getLocation()] = ca1;

		Bird b1 = new Bird('B', "Flies two squares at a time and hits of on the same square", 11);

		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(c1);
		System.out.println(q1);
		System.out.println(ca1);
		System.out.println(b1);
		
	}
	
	public void level2() {

		System.out.println(" ");
		System.out.println("Level 2: Legend");


		Lilypad l2 = new Lilypad('L', "Does nothing", 1);
		moveableList.clear();
		gameBoard[1] = l2;

		Frog f2 = new Frog('F', "Jumps one square at a time can jump jump over any obstacle", 2);
		moveableList.clear();
		gameBoard[f2.getLocation()] = f2;

		DartBlower d2 = new DartBlower('D', "If there are two spaces or closer it will shoot and kill", 9);
		moveableList.clear();
		gameBoard[d2.getLocation()] = d2;

		Chest c2 = new Chest('C', "Gives a point", 14);
		moveableList.clear();
		gameBoard[c2.getLocation()] = c2;

		Queen q2 = new Queen('Q', "When arrived at the Queen the player advances", 5);
		moveableList.clear();
		gameBoard[q2.getLocation()] = q2;

		Cactus ca2 = new Cactus('A', "Hits the player when they step on it", 6);
		moveableList.clear();
		gameBoard[ca2.getLocation()] = ca2;

		Bird b2 = new Bird('B', "Flies two squares at a time and hits of on the same square", 11);

		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(c2);
		System.out.println(q2);
		System.out.println(ca2);
		System.out.println(b2);

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
