import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[]) 
    {
        int number;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = obj.nextInt();
        if(number>0) 
        {
            System.out.println("The number is positive.");
        } 
        else if(number<0) 
        {
            System.out.println("The number is negative.");
        } 
        else 
        {
            System.out.println("The number is zero.");
        }
    }
}