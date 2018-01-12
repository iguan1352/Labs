import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVUtilities {
	private int numColumns;
	private ArrayList<String> CSVData;
	
	public CSVUtilities(File csv) throws IOException
	{
		this.numColumns = 7;
		ArrayList<String> data = new ArrayList<String>();
		Path filePath = Paths.get(csv.getAbsolutePath());
		BufferedReader file = Files.newBufferedReader(filePath);
		String line = file.readLine();
		String[] attributes = null;
		while(line != null)
		{
			line = file.readLine();
			if(line != null)
			{
				attributes = line.split(",");
			}
			if(attributes != null)
			{
				for(String i : attributes)
				{
					data.add(i);
				}
			}	
		}
	}

	public List<String> getColumnHeaders()
	{
		ArrayList<String> headers = new ArrayList<String>();
		for(int i = 0; i < numColumns; i++)
		{
			headers.add(CSVData.get(i));
		}
		return headers;
	}

	public List<String> getDataString(int column)
	{
		ArrayList<String> columnData = new ArrayList<String>();
		for(int i = column; i < this.CSVData.size(); i+=numColumns)
		{
			String value = CSVData.get(i);
			if(value.equals(" "))
			{
				columnData.add("NULL");
			}
			else
			{
				columnData.add(CSVData.get(i));
			}	
		}
		return columnData;
	}
	
	public List<Integer> getDataInt(int column)
	{
		ArrayList<Integer> columnData = new ArrayList<Integer>();
		for(int i = column; i < this.CSVData.size(); i+=numColumns)
		{
			String value = CSVData.get(i);
			if(value.equals(""))
			{
				columnData.add(null);
			}
			else
			{
				columnData.add(Integer.parseInt(value));
			}
		}
		return columnData;
	}
	
	public List<Double> getDataDouble(int column)
	{
		List<Double> columnData = new ArrayList<Double>();
		for(int i = column; i < this.CSVData.size(); i+=numColumns)
		{
			String value = CSVData.get(i);
			if(value.equals(""))
			{
				columnData.add(null);
			}
			else
			{
				columnData.add(Double.parseDouble(value));
			}
		}
		return columnData;
	}
}
