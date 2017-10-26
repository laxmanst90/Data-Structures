package learningHeadFirst;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample1 {
	public void serialization(){
try{
	FileOutputStream objFileOutputStream = new FileOutputStream(new File("MyFile.txt"));
	ObjectOutputStream objObjectOutputStream = new ObjectOutputStream(objFileOutputStream);
	objObjectOutputStream.writeObject("Laxman");
	objObjectOutputStream.writeObject("Arjun");
	objObjectOutputStream.writeObject("Vibha");
	objObjectOutputStream.writeObject("Deepa");
	objObjectOutputStream.close();
}catch(Exception e){
		}
	}
	
	public void deserialization() throws IOException, ClassNotFoundException{
		FileInputStream objFileInputStream = new FileInputStream("MyFile.txt");
		ObjectInputStream objObjectInputStream = new ObjectInputStream(objFileInputStream);
		objObjectInputStream.readObject();
		
	}
	
}
