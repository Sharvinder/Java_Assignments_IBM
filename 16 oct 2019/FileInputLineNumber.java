import java.io.*;
class FileInputLineNumber
{
	public static void main(String[] args)throws IOException
	{
		int j=1;
            char ch;
            FileInputStream f=new FileInputStream("hello.txt");
            System.out.println("\nContents of the file are :");
            int n=f.available();
            System.out.print(j+": ");
            for(int i=0;i<n;i++)
            {
             ch=(char)f.read();
              System.out.print(ch);
              if(ch=='\n')
              {
               System.out.print(++j+": ");
                }
          }
    }
}