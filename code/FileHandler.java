import java.io.File;
import java.util.Scanner;

public class FileHandler{

    private File input;

    public FileManager(String fileName){
	try{
	    File file = new File(fileName);
	}catch(Exception e){
	    e.printStackTrace();
	}
    }

}