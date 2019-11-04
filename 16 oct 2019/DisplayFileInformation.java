import java.io.*;
import java.util.Scanner;
class DisplayFileInformation
{
	public static void main(String[] args) throws IOException
	 {
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter the file name");
	 	String a=sc.nextLine();
		File f=new File(a);
		System.out.println("File name is :" +f.getName());
		System.out.println("File path is :" +f.getPath());
	    System.out.println("File absolute path is :" +f.getAbsolutePath());
	    System.out.println("This file :"+(f.exists()?"Exists":"Does not exists"));
	    System.out.println("This file can be written:"+f.canWrite());
	    System.out.println("This file can be read :"+f.canRead());
	    System.out.println("The length of file is :"+f.length() + " bytes ");

	    if (a.endsWith(".jpg") ||a.endsWith(".gif") || a.endsWith(".png"))
            {
                System.out.println("The given file is an image file.");
            }
            else if (a.endsWith(".exe"))
            {
                System.out.println("The given file is an executable file.");
            }
            else if (a.endsWith(".txt"))
            {   
                System.out.println("The given file is a text file.");
            }
            else
            {
                System.out.println("The file type is unknown.");
            }
        }
    }