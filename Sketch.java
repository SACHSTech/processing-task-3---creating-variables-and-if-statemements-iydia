import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
   * Assignment: 5.4 Processing Task 3 - Creating Variables, If Statements
   * Author: Lydia He
   * Date: Mon Mar 7, 2021
   * Task: drawing the object in random locations using your own variables. 
   */

  public void settings() {
    // Set size of drawing
    size(400, 400);
  }
  
  public void setup() {
    background(0, 0, 0);

    // yellow sun
    stroke(255, 255, 0);
    fill(255, 255, 0);
    float sunX = random(0, height);
    float sunY = random(0, width);
    float sunDiameter = random(50, 100);
    ellipse(sunX, sunY, sunDiameter, sunDiameter);

    // if sun has set
    if (sunY >= 200) {
      background(0, 0, 0);
      ellipse(sunX, sunY, sunDiameter, sunDiameter);
      stroke(0, 0, 0);
      fill(0, 0, 0);
      ellipse(200, 200, 125, 125);

    }
      
    // if sun is up and east of rainbow
    else if (sunX <= 200 && sunY <= 200) {
      background(0, 238, 255);
      ellipse(sunX, sunY, sunDiameter, sunDiameter);
      stroke(0, 238, 255);
      fill(0, 238, 255);
      ellipse(200, 200, 125, 125);
    }
      
    // if sun is up and west of rainbow
    else if (sunX > 200 && sunY <= 200) {
      background(237, 168, 244);
      ellipse(sunX, sunY, sunDiameter, sunDiameter);
      stroke(237, 168, 244);
      fill(237, 168, 244);
      ellipse(200, 200, 125, 125);
    }
  }
    
  public void draw() {
    // Red arc
    stroke(255, 0, 6);
    fill(255, 0, 6);
    ellipse(200, 200, 175, 175);

    // Orange arc
    stroke(255, 127, 0);
    fill(255, 127, 0);
    ellipse(200, 200, 150, 150);

    // Yellow arc
    stroke(255, 210, 0);
    fill(255, 210, 0);
    ellipse(200, 200, 125, 125);
    
    // Green arc
    stroke(100, 206, 0);
    fill(100, 206, 0);
    ellipse(200, 200, 100, 100);
    
    // Blue arc
    stroke(0, 188, 247);
    fill(0, 188, 247);
    ellipse(200, 200, 75, 75);
    
    // Purple arc
    stroke(102, 102, 255);
    fill(102, 102, 255);
    ellipse(200, 200, 50, 50);

    // Grass
    stroke(5, 255, 0);
    fill(5, 255, 0);
    rect(0, 200, 400, 200);

    // Show the current time
    fill(0, 0, 0);
    textSize(16);
    text(day() + "." + month() + "." + year() + " " + (hour() + "h " + minute() + "m " + second() + "s "), 20, 380);
    
  }
}