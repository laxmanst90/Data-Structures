package learningHeadFirst;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritingAndReadingFile {

	public static void main(String[] args){
		WritingAndReadingFile objWritingAndReadingFile = new WritingAndReadingFile();
		objWritingAndReadingFile.writeFile();
		objWritingAndReadingFile.readFile();
		
	}

	private void readFile() {
		// TODO Auto-generated method stub
		try {
			FileReader objFileReader = new FileReader("FirstFile.txt");
			BufferedReader objBufferedReader = new BufferedReader(objFileReader);
			String currentLine="";
			while((currentLine = objBufferedReader.readLine()) != null){
				System.out.println("currentLine"+currentLine);
			}
			objBufferedReader.close();
			objFileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void writeFile() {
		// TODO Auto-generated method stub
		try {
			FileWriter objFileWriter = new FileWriter(new File("FirstFile.txt"));
			BufferedWriter objBufferedWriter = new BufferedWriter(objFileWriter);
			objBufferedWriter.write("Hi This is my First Writing a file!!");
			objBufferedWriter.close();
			objFileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
