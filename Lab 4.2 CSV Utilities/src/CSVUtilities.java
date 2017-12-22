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
			line = file.readLine();
		}
		
		for(String i : attributes)
		{
			if(attributes != null)
			{
				CSVData.add(attributes(i));
			}
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

	public List<String> getDataString(int column)
	{
		List<String> columnData = new ArrayList<String>();
		for(int i = column-1; i < CSVData.size(); i+=numColumns)
		{
			
		}
	}
	
	public List<Integer> getDataInt(int column)
	{
		List<Integer> columnData = new ArrayList<Integer>();
		for(int i = column-1; i < CSVData.size(); i++)
		{
			
		}
	}
	
	public List<Double> getDataDouble(int column)
	{
		List<Double> columnData = new ArrayList<Double>();
		for(int i = column-1; i < CSVData.size(); i++)
		{
			
		}
	}
}
