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
	Drawable[] gameBoard;

	
	
	
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
		
		
		Player1 p1 = new Player1('A', "Does something", 1);
		moveableList.clear();
		gameBoard[p1.getLocation()] = p1;
		
		Frog f1 = new Frog('F', "Jumps one square at a time can jump jump over any obstacle", 2);
		moveableList.clear();
		gameBoard[f1.getLocation()] = f1;
		
		Player3 p3 = new Player3('C', "Does something", 3);
		moveableList.clear();
		gameBoard[p3.getLocation()] = p3;
		
		Player4 p4 = new Player4('D', "Does something", 4);
		moveableList.clear();
		gameBoard[p4.getLocation()] = p4;
		
		Queen p5 = new Queen('E', "Does something", 5);
		moveableList.clear();
		gameBoard[p5.getLocation()] = p5;
		
		Player6 p6 = new Player6('F', "Does something", 6);
		moveableList.clear();
		gameBoard[p6.getLocation()] = p6;
		

		System.out.println(p1);
		System.out.println(f1);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		
	}
	
	public void level2() {
		Player1 p1 = new Player1('A', "Does something", 1);
		moveableList.clear();
		gameBoard[p1.getLocation()] = p1;
		
		Frog p2 = new Frog('B', "Does something", 2);
		moveableList.clear();
		gameBoard[p2.getLocation()] = p2;
		
		Player3 p3 = new Player3('C', "Does something", 3);
		moveableList.clear();
		gameBoard[p3.getLocation()] = p3;
		
		Player4 p4 = new Player4('D', "Does something", 4);
		moveableList.clear();
		gameBoard[p4.getLocation()] = p4;
		
		Queen p5 = new Queen('E', "Does something", 5);
		moveableList.clear();
		gameBoard[p5.getLocation()] = p5;
		
		Player6 p6 = new Player6('F', "Does something", 6);
		moveableList.clear();
		gameBoard[p6.getLocation()] = p6;
		
		System.out.println(" ");
		System.out.println("Level 1: Legend");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		
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
