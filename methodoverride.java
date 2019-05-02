import java.util.Scanner;

class Farm_Problem{
	public void check()
      {
Scanner input = new Scanner(System.in);
System.out.println(" ");
System.out.println(" SYMPTOMS LIST ");
	System.out.println("1. Leaf Rust  ");
	System.out.println("2. Stem rust ");
	System.out.println("3. Sclerotinia "); 
	System.out.println("4. Damping off of seeding ");
        System.out.print( "Choose the symptoms : ");
        int choice = input.nextInt();
        switch(choice){
case 1 : 
System.out.println(" Your farm is affected with a FUNGAL DISEASE ");
System.out.println(" The PROBLEM Is COMMON LEAF RUST IN CORN ");
break;
case 2: 
System.out.println(" Your farm is affected with a FUNGAL DISEASE ");
System.out.println(" The PROBLEM Is WHEAT STEM RUST ");
break;
case 3:
System.out.println(" Your farm is affected with a BACTERIAL DISEASE ");
System.out.println(" The PROBLEM Is WHITE MOLD ");
break;
case 4:
System.out.println(" Your farm is affected with a BACTERIAL DISEASE ");
System.out.println(" The PROBLEM Is PHYTOPHTHORA");
break;
default: 
System.out.println(" No Problem Symptom is selected ");
}
}
}

public class methodoverride{
public static void main (String args[])
{
Scanner input = new Scanner(System.in); 
Farm_Problem obj1 = new Farm_Problem();
Farm_Solution obj2= new Farm_Solution();
System.out.println(" MENU ");
	System.out.print("1. PROBLEM ");
        System.out.println(" 2. SOLUTION  ");
        System.out.println( "Choose the option : ");
        int choice = input.nextInt();
        switch(choice){
case 1 : 
obj1.check();
break;
case 2: 
obj2.check();
break;
default: 
System.out.println(" Invalid option ");
}
}}