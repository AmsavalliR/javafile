import java.io.*;
class Sum
{
public static void main(String args[])
{
try
{
DataInputStream dis = new DataInputStream(System.in);
System.out.println(" Sum of Numbers");
System.out.println("------------------");
System.out.println("Enter the N  value:");
String s1 = dis.readLine();
int n = Integer.parseInt(s1);
System.out.println("Result");
int  sv = n * (n+1) /2;
System.out.println("Sum of Values:"+ sv);
int ss = n *(n+1) * (2 * n+1) / 6;
System.out.println("Sum of Square:" + ss);
int sc = (n *(n+1) / 2) * (n * (n+1) / 2);
System.out.println("Sum  of  cube:" + sc);
}
catch(Exception e)
{
System.out.println("Error:"+e.getMessage());
}
}
}

