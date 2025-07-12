import java.io.*;
public class text
{
public static void main(String args[])
{
RandomAccessFile rfile;
{
try
{
rfile=new RandomAccessFile("City.txt","rw");
rfile.seek(rfile.length());
rfile.writeBytes("Avinashi\n");
rfile.close();
}
catch(IOException ioe)
{
System.out.println(ioe);
}
}
}
}