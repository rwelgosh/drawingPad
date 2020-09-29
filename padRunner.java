import processing.core.PApplet;

public class padRunner extends PApplet {

	public void settings() {
		size(800, 900);
	}
	
	public void setup() {
		background(70);
		rectMode(CENTER);
		fill(255);
		rect(width/2, height/2-100, 540, 540);
		rect(width/2, 800, 200, 50);
		fill(0);
		textSize(50);
		text("Submit", width/2-80, 820);
	}
	
	public void draw() {
		fill(0);
		if(mousePressed) {
			System.out.println("pressed");
			if((mouseX >= width/2 - 270 && mouseX <= width/2 + 270) && (mouseY >= height/2 - 370 & mouseY <= height/2 + 170)) {
				rect(mouseX, mouseY, 20, 20);
			}
		}
	}
	
	public static void main(String[] args) {
		PApplet.main("padRunner");
	}
	
}
