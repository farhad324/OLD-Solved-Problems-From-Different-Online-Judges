//CodeForces 755B PolandBall and Game

import java.util.HashSet;
import java.util.Scanner; 
 
public class Main
{
  public static void main (String[]args) 
  {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    HashSet<String> words = new HashSet<String>();
 
    for(int i=1;i<=n+m;i++)
    {
    String s=sc.next();
    words.add(s);
    }
 
    if(n+m-words.size()>0)
    {
    	int common= n+m-words.size();
    	n-=common;m-=common;
 
    	if(common%2!=0)
    	{
    		n+=(common)/2+1;
            m+=(common)/2;
    	}
    	else
        {
            n+=(common)/2;
            m+=(common)/2;
        }
	}
 
    if(n>m)
        System.out.println("YES");
    else
    	System.out.println("NO");
 
  }
}
