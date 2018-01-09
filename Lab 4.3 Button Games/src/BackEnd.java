import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class BackEnd {

	public BackEnd() {
		//The BackEnd class should handle reading and writing file operations.
		//Your game must have some type of scoring system and maintain a CSV
		//file with the list of high scores. These high scores should be displayed in
		//some way in your application.
		
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
		sb.append("1\n");
		sb.append("2\n");
		
		pw.write(sb.toString());
		pw.close();
		
	}

}
