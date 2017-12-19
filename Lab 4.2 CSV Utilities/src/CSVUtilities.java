import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CSVUtilities {
	private File csv;
	private int numColumns;
	private ArrayList<String> CSVData;
	
	public CSVUtilities(File csv) 
	{
		this.csv = csv;
		this.numColumns = 7;
	}
	
	public List<String> getColumnHeaders()
	{
		List<String> headers = new ArrayList<String>();
		for(int i = 0; i < numColumns; i++)
		{
			headers.add(CSVData[i]);
		}
		return headers;
	}

	public List<String> getData(int column)
	{
		
	}
	
	public List<Integer> getData(int column)
	{
		
	}
	
	public List<Double> getData(int column)
	{
		
	}
}
