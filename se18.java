import java.util.*;
import java.lang.*;
class se18
{
  public static void main(String arg[])
   {
     try
         {
            String s=" ";
	s=s.join(",","3","21");
	System.out.println("july "+s);
	String s1=" ";
	s1=s1.join(":","9","13");
	System.out.println(s1+" pm");
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}