//Codeforces 43A Football

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int acount=0;
      int bcount=0;
      ArrayList<String> goals = new ArrayList<String>();
      int n = sc.nextInt();
      for(int i =1;i<=n;i++)
      {
       String a = sc.next();
       goals.add(a);
      }
      Collections.sort(goals);
      acount=Collections.frequency(goals,goals.get(0));
      bcount=n-acount;
      if(acount>bcount)
       System.out.println(goals.get(0));
      else
       System.out.println(goals.get(n-1));
    }

}
