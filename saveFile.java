import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class saveFile {
	private File file;
	private FileWriter fw;
	
	public saveFile() {
		file = null;
		fw = null;
	}

	public String matrixToFile(int[][] picture, int index) {
		if(picture.length == 27 && picture[0].length == 27) {
			String num = Integer.toString(index);
			String fileName = num + ".txt";
			file = new File(fileName);
			try {
				fw = new FileWriter(file);
				if(!file.createNewFile()) {
					for(int i = 0; i < picture.length; i++) {
						String line = "";
						for(int j = 0; j < picture[i].length; j++) {
							line += Integer.toString(picture[i][j]) + " ";
						}
						line += "\n";
						fw.append(line);
					}
				} else {
					fw.close();
					return "File transcript unsuccesful - 1";
				}
				fw.close();
				return "file successfully created";
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		return "File transcript unsuccesful - 2";
	}
	
}
