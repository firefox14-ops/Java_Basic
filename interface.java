interface animal{
public void eat();
public void sleep();
}

interface ant {
public void eat();
public void sleep();
}

public class interface44 implements animal{
public void eat() {
      System.out.println("Mammal eats");
   }

   public void travel() {
      System.out.println("Mammal travels");
   } 
 
public static void main(String args[]) {
      animal m = new interface44();
      m.eat();
      m.travel();
   }
} 
