import java.util.Scanner;
public class Prog6 {
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int i,j;



int arr[]=new int[100];
System.out.println("Enter the MARKS of 10  Students :\n");

for(i=1;i<=10;i++) {
System.out.println("Marks of student"+i+" is : ");
arr[i]=input.nextInt();

}
System.out.println("Original Marks :\n");
for(i=1;i<=10;i++)
{
System.out.print(arr[i]+"	");
}
int temp[]=new int[10];
for(i=1;i<=10;i++)
{
for(j=i+1;j<=10;j++ )
{
if(arr[i]>arr[j]) {
temp[i]=arr[i];
arr[i]=arr[j];
arr[j]=temp[i];

}

}
}
System.out.println("\nPrinting the Marks in ascending order: \n");
for(i=1;i<=10;i++)
{
System.out.print(arr[i]+"	");
}
System.out.println("\n");

int t;
System.out.print("\n\n");
for(i=1;i<=10;i++) {
t=arr[i];
if(t>=40 && t<=50 ) {
System.out.println("Marks = "+t+"			Grade : Pass\n");

}
else
if(t>=51 && t<=75) {
System.out.println("Marks = "+t+"			Grade : Merit\n");

}
else if(t>75){
System.out.println("Marks = "+t+"			Grade : Distinction\n");

}
else
System.out.println("Marks = "+t+"			Grade : Fail\n");
}
}
}
