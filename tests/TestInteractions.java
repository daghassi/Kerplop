package tests;

public void birdTest() {
  Bird bird = new Bird('B', "Bird", 5);
  IneractionResult result = bird.interact(gameBoard, 5);
  // Test for hitting player when at location
  assertEquals(InteractionResult.HIT, result);

  InteractionResult result2 = bird.interact(gameBoard, 3);
  // Test for not hitting player when not at location
  assertNull(result);
}

public void frogTest() {
  Frog frog = new Frog('F', "Frog", 4);
  InteractionResult result = frog.interact(gameBoard, 0);
  // Test for lack of interaction
  assertEquals(InteractionResult.NONE, result);
}


