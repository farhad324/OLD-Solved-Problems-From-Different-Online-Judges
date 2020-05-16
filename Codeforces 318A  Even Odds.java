//Codeforces 318A - Even Odds

import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    long n=sc.nextLong();
    long k=sc.nextLong();
    long part,output;
     if(n%2==0)
    {
        part=n/2;
    }
    else
    {
        part=(n/2)+1;
    }

    if(k<=part)
    {
        output=(2*k)-1;
    }
    else
    {
        output=(k-part)*2;
    }
    System.out.println(output); 
    }
   }
