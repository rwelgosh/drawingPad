import processing.core.PApplet;

public class padRunner extends PApplet {

	private static saveFile s;
	private int[][] pad = new int[540][540];
	private static int index = 0;
	
	public void settings() {
		size(800, 900);
		s = new saveFile();
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
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						pad[(mouseX-10) + i][(mouseY-10) + j] = 1;
					}
				}
			}
		}
	}
	
	public void mouseReleased() {
		if((mouseX >= width/2 - 100 && mouseX <= width/2 + 100) && (mouseY >= 775 && mouseY <= 825)) {
			int[][] picture = new int[27][27];
			for(int i = 0; i < 27; i++) {
				for(int j = 0; j < 27; j++) {
					
					int sum = 0;
					for(int k = 0; k < 20; k++) {
						for(int l = 0; l < 20; l++) {
							sum += pad[(i*20) + k][(j*20) + l];
							pad[(i*20) + k][(j*20) + l] = 0;
						}
					}
					picture[i][j] = sum;
					
				}
			}
			
			s.matrixToFile(picture, index);
			index++;
			
			fill(255);
			rect(width/2, height/2 - 100, 540, 540);
			
		}
	}
	
	public static void main(String[] args) {
		PApplet.main("padRunner");
	}
	
}
