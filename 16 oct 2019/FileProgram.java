import java.io.*;
class FileProgram extends CopyDataThread
{
	public static void main(String[] args) {
		CopyDataThread fileP=new FileProgram();
		File infile = new File("C:\\Users\\SharvinderKour\\Desktop\\java\\source.txt");
		File outfile = new File("C:\\Users\\SharvinderKour\\Desktop\\java\\target.txt");
		fileP.CopyDataThread(infile,outfile);
	}
}