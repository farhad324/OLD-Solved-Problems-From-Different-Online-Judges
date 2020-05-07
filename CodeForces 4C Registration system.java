//CF-4C. Registration system

import java.util.*; 

public class Main
{
  public static void main (String[]args) 
  {
    Scanner sc=new Scanner(System.in);
    int t = sc.nextInt();
    HashMap<String, Integer> users = new HashMap<String, Integer>();
    String s;
    for(int i=1;i<=t;i++)
    {
       s=sc.next();
      if(users.containsKey(s))
      {
    	  System.out.println(s+""+users.get(s));
    	  users.put(s+""+users.get(s),1);
    	  users.put(s,users.get(s)+1);
    	 
      }
      else
      {
          users.put(s,1);
    	  System.out.println("OK");
    	  
      }

    
    }
  }
}
