
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class BackEnd {

	public static void fileCSV(int numClicks) 
	{
		PrintWriter pw = null;
		try
		{
			pw = new PrintWriter(new File("results.csv"));
		}
		catch(FileNotFoundException e)
		{
			System.err.println(e);
		}
		StringBuilder sb = new StringBuilder();
		sb.append(numClicks + "\n");
		pw.write(sb.toString());
		pw.close();
	}




}
