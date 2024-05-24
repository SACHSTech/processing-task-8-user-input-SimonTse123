import processing.core.PApplet;

public class Sketch extends PApplet {
	// Declaring all variables
	float intSunX = 50;
  float intSunY = 50;

  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;

  int intHouseX = 250;
  int intHouseY = 200;

  int intGrassColour = 79;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// Size of the screen
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Original image
    background(43, 223, 255 );
    cordHouse(intHouseX , intHouseY, 75, 100);
    cordGrass(0, 300, 79);
    textSize(72);
    text(key, 50, 250);
    cordSun(intSunX,intSunY, 50);

    // Movement of the sun using boolean variables
    if (keyPressed){
      if (upPressed) {
        intSunY--;
      }
      if (downPressed) {
        intSunY++;
      }
      if(leftPressed){
        intSunX--;
      }
      if(rightPressed){
        intSunX++;
      }
    }
    // Movement of the house using key inputs
    if (keyPressed){
      if (key == 'w') {
        intHouseY--;
      }
      else if (key == 's') {
        intHouseY++;
      }
      else if(key == 'a'){
        intHouseX--;
      }
      else if(key == 'd'){
        intHouseX++;
      }
    }
    // Creation of a tree when key is pressed
    if(keyPressed) {
      if(key == 't' ){
        cordTree(mouseX, mouseY);
      }
    }
    // Changing the colour of the sun
    if(keyPressed){
      if(key == 'm'){
        cordMoon(intSunX, intSunY, 50);
      }
    }
  }
/**
 *  A method cordHouse that makes a house with parameters
 * @param x x is the x coordinate of the rectangular section of the house
 * @param y y is the y coordinate of the rectangular section of the house
 * @param width width is width of the house
 * @param length length is the length of the house
 */
  private void cordHouse(int x, int y, int width, int length){
    strokeWeight(2);
    stroke(0);
    fill(190, 255, 189);
    rect(x, y, width, length);
    triangle(x, y, x + width, y , x + width / 2, y - length / 2);
    strokeWeight(0);
    fill(54, 21, 14);
    ellipse( x + width / 2, y + length / 2 + 10, 30, 30);
    rect(x + width / 2 - 15, y + length / 2 + 10, 30, 40);
  }
/**
 *  A method cordGrass that creates grass with parameters.
 * @param x1 x1 is the x coordinate the grass is orginally drawn from
 * @param y1 y1 is the y coordinate the grass is orignally drawn from
 * @param intColourGrass a value that adjusts the colour of the grass
 */
  private void cordGrass(int x1, int y1, int intColourGrass){
    fill(intColourGrass + 1, intColourGrass + 120, intColourGrass - 59);
    rect(x1, y1, 400, 100);
  }
/**
 *  A method cordSun that creates a sun at a given coordinate and size
 * @param x2 x2 is the x coordinate of the sun
 * @param y2 y2 is the y coordinate of the sun
 * @param size size refers to the size of the sun
 */
  private void cordSun(float x2, float y2, int size){
    strokeWeight(1);
    fill(249, 255, 89);
    ellipse(x2, y2, size, size);
  
  }
/**
 *  A method cordTree that creates a tree at a coordinate
 * @param treeX treeX is the x coordinate the rectangular section of the tree is drawn from
 * @param treeY treeY is the y coordinate the rectangular section of the tree is drawn from
 */
  private void cordTree (int treeX, int treeY) {
    fill(161, 100, 63);
    rect(treeX, treeY, 25, 75);
    fill(92, 224, 83);
    ellipse(treeX + 25/2, treeY, 50, 50);
  }
  /**
   *  A method cordMoon that creates a moon at a coordinate and size
   * @param moonX moonX is the x coordinate the moon is drawn from
   * @param moonY moonY is the y coordinate the moon is drawn from
   * @param size size refers the the size of the moon
   */
  private void cordMoon(float moonX,float moonY, int size){
    strokeWeight(1);
    fill(237, 236, 216);
    ellipse(moonX, moonY, size, size);
    
  }
  /*
   * A method mousePressed that changes the background's colour when the user presses the mouse
   */
  public void mousePressed(){
    background(64, 81, 194);
    cordHouse(intHouseX , intHouseY, 75, 100);
    cordGrass(0, 300, 79);
    textSize(72);
    text(key, 50, 250);
    cordSun(intSunX,intSunY, 50);
  }
/*
 *  A method mouseDragged that changes the background's colour when the user drags the mouse
 */
  public void mouseDragged(){
    background(14, 10, 89);
    cordHouse(intHouseX , intHouseY, 75, 100);
    cordGrass(0, 300, 79);
    textSize(72);
    text(key, 50, 250);
    cordSun(intSunX,intSunY, 50);
    fill(83, 92, 55);
    ellipse(mouseX, mouseY, 50, 25);
  }
/**
 * A method that changes the boolean value of variables when certain keys are pressed
 */
  public void keyPressed() {
    if (keyCode == UP) {
      upPressed = true;
    }
    else if (keyCode == DOWN) {
      downPressed = true;
    }
    else if (keyCode == LEFT) {
      leftPressed = true;
    }
    else if (keyCode == RIGHT) {
      rightPressed = true;
    }
  }
/**
 *  A method keyReleased that changes the boolean value of variables when certain keys are released
 */
  public void keyReleased() {
    if (keyCode == UP) {
      upPressed = false;
    }
    else if (keyCode == DOWN) {
      downPressed = false;
    }
    else if (keyCode == LEFT) {
      leftPressed = false;
    }
    else if (keyCode == RIGHT) {
      rightPressed = false;
    }
  }
}

