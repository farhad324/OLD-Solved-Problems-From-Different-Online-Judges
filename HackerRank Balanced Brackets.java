//Practice>>DataStructures>>Stacks>>Balanced Brackets

import java.util.*; 

class Solution
{
  public static void main (String[]args) 
  {
    Scanner sc=new Scanner(System.in);
    int t =sc.nextInt();
    for(int i=1;i<=t;i++)
    {
      boolean flag=true;
      
      String s= sc.next();
      Stack<Character> st = new Stack<Character>();
      
      for(int c=0;c<s.length();c++)
      {
        char b= s.charAt(c);
            if (b=='[' || b=='{' || b=='(')
            {
               st.push(b); 
            } 
            else 
            {
              if(!st.empty())
              {
               if((b==']'&& st.peek()=='[') || (b=='}'&& st.peek()=='{') || (b==')'&& st.peek()=='(') )
               {
                st.pop();
               }
               else
               {
                st.push(b);
               }
              }
              else
              {
                st.push(b);
              }
            }
      }
               if (st.empty()) 
                {
                  flag=true;
                }
              else
              {
                flag = false;
              } 

            if (flag==true)
            {
              System.out.println("YES");
            }
            else
            {
              System.out.println("NO");
            }
    }
  }
}
