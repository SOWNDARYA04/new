import java.util.Scanner;

public class JavaProgram
{
   public static void main(String args[])
   {
       String strOrig, strNew;
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter a String : ");
       strOrig = scan.nextLine();
       stringBuffer s=new StringBuffer(strOrig);
       s.reverse();
       
       
       strNew = s.replaceAll("[aeiouAEIOU]", "");
	   
       System.out.print("All Vowels Removed Successfully..!!\nNow the String is :\n");
              
       System.out.print(strNew);
   }
}
