import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class solution
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int count=0;
        int x1=in.nextInt();
        int v1=in.nextInt();
        int x2=in.nextInt();
        int v2=in.nextInt();
        for(int i=0;i<100000;i++)
        {
            x1=x1+v1;
            x2=x2+v2;
            if(x1==x2)
            count++;
        }
        if(count!=0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
