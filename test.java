package p1;
import java.util.Scanner;
class Calculator{
public void main_1()
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
class SUB extends ADD{
public void substract(int a,int b)
{
System.out.println(" SUBSTRACTING NUMBERS... ");
System.out.println(" The sum is :" +(a-b));
}
}class MUL extends SUB{
public void multiply(int a,int b)
{
System.out.println(" MULTIPLYING NUMBERS... ");
System.out.println(" The sum is :" +(a*b));
}
}
class DIV extends MUL{
public void divide(int a,int b)
{
System.out.println(" DIVIDING NUMBERS... ");
System.out.println(" The sum is :" +(a/b));
}
}

public class test extends DIV{
public static void main (String args[])
{
Scanner input = new Scanner(System.in);
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
obj4.divide(a,b);
}
}