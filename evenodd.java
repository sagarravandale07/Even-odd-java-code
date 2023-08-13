import java.io.*;
import java.util.*;

public class evenodd
{
    public static void main(String args[])
    {
        int no;

        Scanner s = new Scanner(System.in);

        System.out.print("\n\n Enter Any Number: ");
        no = s.nextInt();

        if(no%2==0)
        {
            System.out.print(no + " is Even Number");
        }
        else
        {
            System.out.print(no + " is Odd Number");
        }
    }
}
