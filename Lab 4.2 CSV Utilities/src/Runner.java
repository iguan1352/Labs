
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;

public class Runner {
	
	public static void main(String[] args) throws IOException
	{
		File csv = new File("New_York_City_Leading_Causes_of_Death.csv");
		CSVUtilities csvFile =  new CSVUtilities(csv); 
		
		ArrayList<String> newTable = new ArrayList<String>();
		newTable = (ArrayList<String>) csvFile.getDataString(7);
		csvFile.getDataString(7);
	}

}
