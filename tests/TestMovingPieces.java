package tests;

@Test
public void testBird() {
  Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
  Bird bird = new Bird(6);
  gameBoard[6] = bird;
  
}

@Test
public void testFrog() {

}
