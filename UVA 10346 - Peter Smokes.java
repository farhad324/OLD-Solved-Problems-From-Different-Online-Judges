//UVA 10346 - Peter Smokes

import java.util.Scanner;
public class UVA_10346
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner (System.in);
    while(sc.hasNext())
    {
      int n= sc.nextInt();
      int k=sc.nextInt();
      
      int total=n;
      while(n>=k)
      {
        int renew=n/k;
        total=total+renew;
        n=renew+(n%k);
      }
      System.out.println(total);
    }
  }
}
    
