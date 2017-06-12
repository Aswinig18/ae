import java.io.*;
import java.util.*;
class sum
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int t=s.nextInt();
int n=0;
int a=0;
while(t>0)
{
n=t%10;
a=a+n;
t=t/10;
}
System.out.println(a);
}
}
