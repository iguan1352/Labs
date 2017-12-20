import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVUtilities {
	private File csv;
	private int numColumns;
	private ArrayList<String> CSVData;
	
	public CSVUtilities(File csv) throws IOException
	{
		this.numColumns = 7;
		Path filePath = Paths.get(csv.getAbsolutePath());
		BufferedReader file = new BufferedReader(new FileReader(csv));
		String line = file.readLine();
		String[] attributes = null;
		while(line != null)
		{
			attributes = line.split(",");
			
		}
		
		for(String i : attributes)
		{
			//if()
		}
		
	}
	
	public List<String> getColumnHeaders()
	{
		List<String> headers = new ArrayList<String>();
		for(int i = 0; i < numColumns; i++)
		{
			headers.add(CSVData.get(i));
		}
		return headers;
	}

	public List<String> getData(int column)
	{
		List<String> columnData = new ArrayList<String>();
		for(int i = column-1; i < CSVData.size(); i + 7)
	}
	
	public List<Integer> getData(int column)
	{
		
	}
	
	public List<Double> getData(int column)
	{
		
	}
}
