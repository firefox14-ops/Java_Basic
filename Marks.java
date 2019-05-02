import java.util.Scanner;
class Print{
int result;
Print(int a,int b,int c,int d,int e)
{
this.result=a+b+c+d+e;
System.out.println("The total is " +this.result);
}

Print()
{
this.result=0;
}
}
public class Marks{
	public static void main(String args[])
{
Scanner o = new Scanner(System.in);
int i=1;  
while(i<=5)
{
System.out.println("Enter ur sub1 marks");
int a = o.nextInt();
System.out.println("Enter ur sub2 marks");
int b = o.nextInt();
System.out.println("Enter ur sub3 marks");
int c = o.nextInt();
System.out.println("Enter ur sub4 marks");
int d = o.nextInt();
System.out.println("Enter ur sub5 marks");
int e = o.nextInt();

Print obj = new Print();
Print obj2 = new Print(a,b,c,d,e);
}
}
}