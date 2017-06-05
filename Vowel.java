import java.io.*;
import java.util.Scanner;

public class Vowel{
    public static void main(String args[])
    {
        System.out.println("enter char");
        Scanner s=new Scanner(System.in);
        char n=s.next().charAt(0);
        if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
        {
            System.out.println("vowels");
        }
       else
        {
            System.out.println("consonent");
        }
        
}}
