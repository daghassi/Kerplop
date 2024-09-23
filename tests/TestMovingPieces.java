package tests;

@Test
public void testBird() {
  Drawable [] gameBoard = new Drawable[10];
  Bird bird = new Bird('B', "Bird", 6);
  gameBoard[6] = bird;
  bird.move(gameBoard, 0);
  // Test for nullifying the old spot and moving to a new spot
  assertNull(gameBoard[5]);
  assertEquals(bird, gameBoard[7]);

  Bird bird2 = new Bird('B', "Bird", 8);
  gameBoard[8] = bird2;
  bird2.move(gameBoard, 0);
  // Test for moving to the edge and changing direction
  assertNull(gameBoard[8]);
  assertEquals(bird2, gameBoard[6]);


}

@Test
public void testFrog() {
  
}
