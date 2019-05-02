import  java.util.Scanner;
public class prog3 {
public static void main(String args[]) {
int n,first=0,second=1,add=0;
Scanner input=new Scanner(System.in);
System.out.println("enter the value : ");
n=input.nextInt();
for(int i=0;i<n;i++) {
System.out.print(add+ " ");
add=first+second;
first=second;
second=add;
}
}
}