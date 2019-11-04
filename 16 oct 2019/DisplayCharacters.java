import java.io.*;
import java.util.Scanner;
class CountWords
{
	public static void main(String[] args) throws IOException {
		int wordsCount=0;
		int lineCount=1;
		char charCount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of file");
		String a=sc.nextLine();
		FileInputStream bf=new FileInputStream(a);
		int n=bf.available();
		for(int i=0;i<n;i++)
		{
			charCount=(char)bf.read();
			if (charCount=='\n')
			 lineCount++;
			else if(charCount==' ')
				wordsCount++;
		}
		 System.out.println("\nNumber of lines : "+lineCount);
         System.out.println("\nNumber of words : "+(lineCount+wordsCount));
         System.out.println("\nNumber of characters : "+n);
	}
}