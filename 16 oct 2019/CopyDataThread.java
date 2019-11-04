import java.util.*;
import java.io.*;

public class CopyDataThread
 {
	public static void CopyDataThread(File infile,File outfile)
	 {
	 	FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader(infile);
			fw = new FileWriter(outfile);
			int count=0;
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
				count=count+1;
				if(count==10) {
					System.out.println("10 Characters are copied");
					count=0;
					try
					{
						Thread.sleep(5000);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		} catch (IOException e) {
			System.out.println(e);
			System.exit(-1);
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
			}
		}

	}
}


