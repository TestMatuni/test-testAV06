//Arjun Vasudevan
import java.util.*;
public class Rectangle
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Length --> ");
        int len = in.nextInt();
        System.out.print("Enter the Width --> ");
        int wid = in.nextInt();
        
        System.out.println("\nPerimeter = " + (len+len+wid+wid));
        System.out.println("Area = " + len*wid);
    }
}