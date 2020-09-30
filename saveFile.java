import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class saveFile {
	private File file;
	private FileWriter fw;
	
	public saveFile() {
		file = null;
		try {
			fw = new FileWriter(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String matrixToFile(int[][] picture) {
		if(picture.length == 27 && picture[0].length == 27) {
			
		} 
		return "File transcript unsuccesful";
	}
	
}
