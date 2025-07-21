interface personal
{
void showpersonal();
}
interface academics
{
void showacademics();
}
public class student implements personal,academics
{
String name;
int age;
int rollno;
float marks;
student(String n,int a,int r,float m)
{
name=n;
age=a;
rollno=r;
marks=m;
}
public void showpersonal()
{
System.out.println("Name="+name);
System.out.println("Age="+age);
}
public void showacademics()
{
System.out.println("Roll No="+rollno);
System.out.println("Marks="+marks);
}
public static void main(String args[])
{
student s=new student("VJ",19,59,99.9f);
s.showpersonal();
s.showacademics();
}
} 