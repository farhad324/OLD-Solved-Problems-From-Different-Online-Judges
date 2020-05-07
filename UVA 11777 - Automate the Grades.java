//UVA 11777 - Automate the Grades
//Used the "Reader" class for faster inputs

import java.io.*;

public class Main
 {

 public static char getGrade(double grade) {
  if (grade >= 90)
   return 'A';
  if (grade >= 80)
   return 'B';
  if (grade >= 70)
   return 'C';
  if (grade >= 60)
   return 'D';
  else
   return 'F';
 }

 public static void main(String[] args)throws IOException 
 {
   Reader sc=new Reader();
  int t = sc.nextInt();
  for (int k = 1; k <= t; k++) 
  {
   int[] a = new int[7];
   for (int i = 0; i < 7; i++)
    a[i] = sc.nextInt();

   int CT1 = Math.max(Math.max(a[4], a[5]), a[6]);
   int CT2 =( a[4] + a[5] + a[6] - CT1 - Math.min(Math.min(a[4], a[5]), a[6]));
   double CT = ((CT1 + CT2) / 2.0);
   double sum = (a[0] + a[1] + a[2] + a[3] + CT);
   char grade = getGrade(sum);
   System.out.printf("Case %d: %c\n", k, grade);
  }
 }

}
class Reader
{
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;
 
    public Reader()
    {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
 
    public Reader(String file_name) throws IOException
    {
        din = new DataInputStream(new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }
 
    public String readLine() throws IOException
    {
        byte[] buf = new byte[64]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1)
        {
            if (c == '\n')
                break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }
 
    public int nextInt() throws IOException
    {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do
        {
            ret = ret * 10 + c - '0';
        }  while ((c = read()) >= '0' && c <= '9');
 
        if (neg)
            return -ret;
        return ret;
    }
 
    public long nextLong() throws IOException
    {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }
 
    public double nextDouble() throws IOException
    {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
 
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
 
        if (c == '.')
        {
            while ((c = read()) >= '0' && c <= '9')
            {
                ret += (c - '0') / (div *= 10);
            }
        }
 
        if (neg)
            return -ret;
        return ret;
    }
 
    private void fillBuffer() throws IOException
    {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1)
            buffer[0] = -1;
    }
 
    private byte read() throws IOException
    {
        if (bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }
 
    public void close() throws IOException
    {
        if (din == null)
            return;
        din.close();
    }
    
}
