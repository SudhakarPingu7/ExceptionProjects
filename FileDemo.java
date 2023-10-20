package exception;

import java.io.File;                    //FileNotfound and IOException
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
	
	File e=new File("C:\\\\Users\\\\user\\\\Desktop\\\\sudhkar.txt");
	FileReader a=new FileReader(e);          //check the file is there are not 
	int temp=0;
	while((temp=a.read())!=-1) {                    
		System.out.println((char)(temp));
	}

}
}
