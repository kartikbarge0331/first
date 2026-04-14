//switch
import javax.swing.*;
class atest
{
public static void main(String[]args)
{
String num=JOptionPane.showInputDialog(" enter 1 foe namaste  \n enter 2 foe hello \n esnter 3 for bonjore");
int n=Integer.parseInt(num);
switch (n)
{
case 1 :
System.out.println("namaste");
break;
case 2 :
System.out.println("hello");
break;
case 3 :
System.out.println("bonjore");
break;
default :
System.out.println("invalid choice");
}
}
}