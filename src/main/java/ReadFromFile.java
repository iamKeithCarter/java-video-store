import java.io.File;
import java.util.Scanner;

public class ReadFromFile {
	Scanner readToScanner;
	public void ReadFile(){
		
		try{
			readToScanner = new Scanner(new File("PrintableStatement.txt"));
		}
		catch (Exception e ){
			System.out.println("Unable to read from file");
		
		}
		while(readToScanner.hasNext()){
			String listofStatement= readToScanner.nextLine();
			System.out.format("%s\n", listofStatement);
		}
	}
	
}
