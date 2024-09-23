package tests;

public void birdTest() {
  Drawable[] gameBoard = new Drawable[10];
  Bird bird = new Bird('B', "Bird", 5);
  IneractionResult result = bird.interact(gameBoard, 5);
  // Test for hitting player when at location
  assertEquals(InteractionResult.HIT, result);

  InteractionResult result2 = bird.interact(gameBoard, 3);
  // Test for not hitting player when not at location
  assertNull(result);
}

public void frogTest() {
  Drawable[] gameBoard = new Drawable[10];
  Frog frog = new Frog('F', "Frog", 4);
  InteractionResult result = frog.interact(gameBoard, 0);
  // Test for lack of interaction
  assertEquals(InteractionResult.NONE, result);
}

public void cactusTest() {
  Drawable[] gameBoard = new Drawable[10];
  Cactus cactus = new Cactus('C', "Cactus", 3);
  InteractionResult result = cactus.interact(gameBoard, 3);
  // Test when player touches cactus
  assertEquals(InteractionResult.HIT, result);

  InteractionResult result2 = cactus.interact(gameBoard, 3);
  //Test when player doesn't interact
  assertNull(result2);

}

public void chestTest() {
  Drawable[] gameBoard = new Drawable[10];
  Chest chest = new Chest('C', "Chest", 2);
  InteractionResult result = chest.interact(gameBoard, 2);
  // Test when player touches chest
  assertEquals(InteractionResult.GET_POINT, result);

  // Test when player doesn't interact
  assertNull(result);
}

public void dartBlowerTest() {
  Drawable[] gameBoard = new Drawable[10];
  DartBlower dartBlower = new DartBlower('D', "DartBlower", 5);
  InteractionResult result = dartBlower.interact(gameBoard, 6);
  // Test when player in range
  assertEquals(InteractionResult.KILL, result);

  // Test when player out of range
  InteractionResult result2 = dartBlower.interact(gameBoard, 8);
  assertNull(result);
}

public void queenTest() {
  Drawable[] gameBoard = new Drawable[10];
  Queen queen = new Queen('Q', "Queen", 4);
  InteractionResult result = queen.interact(gameBoard, 3);
  InteractionResult result2 = queen.ineract(gameBoard, 5);
  // Test when player is adjacent
  assertEquals(InteractionResult.ADVANCE, result);
  assertEquals(InteractionResult.ADVANCE, result2);

  InteractionResult result3 = queen.interact(gameBoard, 4);
  // Test when player is not adjacent
  assertNull(result3);
}
