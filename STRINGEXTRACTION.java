import java.io.*;
import java.lang.*;
public class  STRINGEXTRACTION
{
public static void main(String args[])
{
String s1="Computer Technology";
System.out.println("Single Character Extraction");
char ch;
ch="Computer".charAt(3);
System.out.println("3rd Character"+ch);
System.out.println("More than one character extraction");
int st=6;
int end=15;
char buf[]=new char[end-st];
s1.getChars(st,end,buf,0);
System.out.println(buf);
System.out.println("String to Array");
char[] c="Hello".toCharArray();
System.out.println(c);
}
}