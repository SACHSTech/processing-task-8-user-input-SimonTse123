import processing.core.PApplet;

public class Sketch extends PApplet {
	
	int intSunX = 50;
  int intSunY = 50;
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
    background(43, 223, 255);
    cordHouse(250, 200, 75, 100);
    cordGrass(0, 300);
    
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
    cordSun(intSunX,intSunY, 50);
    ellipse(mouseX, mouseY, 50, 50);
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

  private void cordGrass(int x1, int y1){
    fill(80, 199, 40);
    rect(x1, y1, 400, 100);
  }

  private void cordSun(int x2, int y2, int size){
    strokeWeight(1);
    fill(249, 255, 89);
    ellipse(x2, y2, size, size);
    
  }
}

