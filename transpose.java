import java.io.*;
import java.lang.*;
import java.util.Scanner;
class transpose
{
public static void main(String args[])
{
int [][] arr;
int i,j,n;
Scanner obj=new Scanner(System.in);
int [][] a=new int [10][10];
System.out.println("Enter the n value:");
n=obj.nextInt();
System.out.println("Enter matrix value:");
for( i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=obj.nextInt();
}
}
System.out.println("Transpose matrix");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.println(a[j][i]);
}
}
}
}