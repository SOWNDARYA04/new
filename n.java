import java.util.Scanner;

public class n
{
    public static void main(String args[])
    {
        int a, b, c, big;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Three Numbers : ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        // let a is the largest
        
        big = a;
        
        if(big<b)
        {
            if(b>c)
            {
                big = b;
            }
            else
            {
                big = c;
            }
        }
        else if(big<c)
        {
            if(c>b)
            {
                big = c;
            }
            else
            {
                big = b;
            }
        }
        else
        {
            big = a;
        }
		
        System.out.print("Largest Number is " +big);
    }
}
