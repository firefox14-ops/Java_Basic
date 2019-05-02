import java.util.Scanner;
public class Prog1 {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the value for x");
int x=input.nextInt();
System.out.println("Enter the value for y");
int y=input.nextInt();
System.out.println("Enter the value for z");
int z=input.nextInt();
if (x>y && x>z){
System.out.println(x + " is greatest ");
}
else if (y>z && y>x) {
System.out.println(y + " is greatest");
}
else {
System.out.println(z + " is greatest");
}

}
}
