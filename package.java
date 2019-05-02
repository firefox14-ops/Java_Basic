package p;
import java.util.Scanner;
class Calculator{
public void main()
{
System.out.println(" WELCOME TO CALCULATOR ");
}
}
class ADD extends Calculator{
public void add(int a,int b)
{
System.out.println(" ADDING NUMBERS... ");
System.out.println(" The sum is :" +(a+b));
}
}
class SUB extends Calculator{
public void substract(int a,int b)
{
System.out.println(" ADDING NUMBERS... ");
System.out.println(" The sum is :" +(a-b));
}
}
class MUL extends Calculator{
public void multiply(int a,int b)
{
System.out.println(" ADDING NUMBERS... ");
System.out.println(" The sum is :" +(a*b));
}
}
class DIV extends Calculator{
public void divide(int a,int b)
{
System.out.println(" ADDING NUMBERS... ");
System.out.println(" The sum is :" +(a/b));
}
}

public class test{
public static void main (String args[])
{
Calculator obj = new Calculator();
obj.main();
System.out.print( " Enter number_1 : ");
int a = input.nextInt();
System.out.print( " Enter number_2 : ");
int b = input.nextInt();
ADD obj1 = new ADD();
obj1.add(a,b);
SUB obj2 = new SUB();
obj2.substract(a,b);
MUL obj3 = new MUL();
obj3.multiply(a,b);
DIV obj4 = new DIV();
obj4.multiply(a,b);
}
}