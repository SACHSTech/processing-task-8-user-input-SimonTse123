import processing.core.PApplet;

public class Sketch extends PApplet {
	
	int intSunX = 50;
  int intSunY = 50;

  int intHouseX = 250;
  int intHouseY = 200;

  int intGrassColour = 79;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
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
    background(43, 223, 255 );
    cordHouse(intHouseX , intHouseY, 75, 100);
    cordGrass(0, 300, 79);
    textSize(72);
    text(key, 50, 250);
    cordSun(intSunX,intSunY, 50);

    // 
    if (keyPressed){
      if (keyCode == UP) {
        intSunY--;
      }
      else if (keyCode == DOWN) {
        intSunY++;
      }
      else if(keyCode == LEFT){
        intSunX--;
      }
      else if(keyCode == RIGHT){
        intSunX++;
      }
    }
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

    if(keyPressed) {
      if(key == 't' ){
        cordTree(mouseX, mouseY);
      }
    }

    if(keyPressed){
      if(key == 'm'){
        cordMoon(intSunX, intSunY, 50);
      }
    }
    if(mousePressed == true) {
      intGrassColour = 150;
    }
  }
/**
 *  A method cordHouse that makes a house with parameters
 * @param x
 * @param y
 * @param width
 * @param length
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

  private void cordGrass(int x1, int y1, int intColourGrass){
    fill(intColourGrass + 1, intColourGrass + 120, intColourGrass - 59);
    rect(x1, y1, 400, 100);
  }
/**
 * 
 * @param x2
 * @param y2
 * @param size
 */
  private void cordSun(int x2, int y2, int size){
    strokeWeight(1);
    fill(249, 255, 89);
    ellipse(x2, y2, size, size);
  
  }
/**
 * 
 * @param treeX
 * @param treeY
 */
  private void cordTree (int treeX, int treeY) {
    fill(161, 100, 63);
    rect(treeX, treeY, 25, 75);
    fill(92, 224, 83);
    ellipse(treeX + 25/2, treeY, 50, 50);
  }
  /**
   * 
   * @param moonX
   * @param moonY
   * @param size
   */
  private void cordMoon(int moonX, int moonY, int size){
    strokeWeight(1);
    fill(237, 236, 216);
    ellipse(moonX, moonY, size, size);
    
  }
}

