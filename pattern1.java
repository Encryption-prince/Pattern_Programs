//butterfly pattern
import java.util.*;
public class pattern1{
    public static void main(String[]args)
    {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=n;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
               System.out.print("*");
            for(int j = s+3;j>=1;j--)
               System.out.print(" ");
            for(int j = 1;j<=i;j++)
               System.out.print("*");
          System.out.println();
           s-=2;
        }
        s=1;
        for(int i = n;i>=1;i--)
        {
            for(int j = 1;j<=i;j++)
               System.out.print("*");
            for(int j = 1;j<s;j++)
              System.out.print(" ");
            for(int j = 1;j<=i;j++)
               System.out.print("*");
          System.out.println();
           s+=2;
        }
        sc.close();
                                    }
}