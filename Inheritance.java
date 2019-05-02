import java.util.Scanner;
class SCS{

String java= "DHIRENDER KUMAR sir";
int fact_id_java = 121;
String sepm = "KALPANA mam";
int fact_id_sepm = 111;
String networking = "GAYATRI mam";
int fact_id_networking = 111;

public void java(){
System.out.println("");
 System.out.println(" SCS record  ");
 System.out.println(" I am a JAVA teacher  ");
 System.out.println( " My name is " +java);
}
public void sepm(){
System.out.println("");
 System.out.println(" SCS record  ");
 System.out.println(" I am a SEPM teacher  ");
 System.out.println( " My name is " +sepm);
}
public void networking(){
System.out.println("");
 System.out.println(" SCS record  ");
 System.out.println(" I am a networking teacher  ");
 System.out.println( " My name is " +networking);
}
}

class Systemetics extends SCS{

public void java(){
System.out.println("");
        System.out.println(" Systemetics...  ");
	System.out.println(" My faculty_ID is " +super.fact_id_java);
	super.java();
	System.out.println("");
}
public void sepm(){
System.out.println("");
	System.out.println(" Systemetics..  ");
	System.out.println(" My faculty_ID is " +super.fact_id_sepm);
	super.sepm();
	System.out.println("");
}
}

class Cybernatics extends Systemetics{

public void networking(){
System.out.println("");
	System.out.println(" Cybernatics..  ");
	System.out.println(" My faculty_ID is " +super.fact_id_networking);
	super.networking();
	System.out.println("");
}
}

public class Inheritance{
public static void main (String args[])
{
 Scanner input = new Scanner(System.in); 	
Cybernatics obj = new Cybernatics();
char i ='y';
while (i == 'y'){
System.out.println(" FACULTY DETAILS LIST ");
	System.out.println(" 1. Java ");
        System.out.println(" 2. SEPM  ");
	System.out.println(" 3. Networking  ");
        System.out.print( "Choose the option : ");
        int choice = input.nextInt();
        switch(choice){
case 1 : 
obj.java();
break;
case 2: 
obj.sepm();
break;
case 3: 
obj.networking();
break;
default: 
System.out.println(" Invalid option ");
}
System.out.print("Do u want to continue (y/n) :" );
			i = input.next().charAt(0);
}	
}}