import java.util.Scanner;

class MySplit
{
	public static String[] mySplit(String text,String delemeter)
    {
    java.util.List<String> parts = new java.util.ArrayList<String>();
    text+=delemeter;        

    for (int i = text.indexOf(delemeter), j = 0; i != -1 ; ) 
    {
        parts.add(text.substring(j,i));
        j=i+delemeter.length();
        i = text.indexOf(delemeter,j);
    }

    return parts.toArray(new String[0]);
}

public static void main(String[] args)
{
    String str, delemeter=" ";
   
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string you want to split");
    str=sc.nextLine();
    System.out.println("Enter the delemeter");
    delemeter=sc.nextLine();
    System.out.println("The result is:");
    String result[]=mySplit(str,delemeter);
    
    for(String s:result)
        System.out.println(s);
    }
}