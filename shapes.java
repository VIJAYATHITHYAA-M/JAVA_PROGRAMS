import java.applet.*; 
import java.awt.*; 
public class Shapes extends Applet  
{    
public static void Paint(Graphics g)  
{        
String str1 = "My shapes";        
g.setColor(Color.red);        
g.drawString(str1,20,20);        
g.setColor(Color.black);    
g.fillRect(80,80,80,80);    
g.setColor(Color.blue); 
g.fillOval(80,150,80,150);  
g.setColor(Color.green); 
g.fillOval(160,150,50,50);       
g.setColor(Color.orange);      
g.fillRect(420,200,220,230);     
}
 } 