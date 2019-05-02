interface animal{
public void eat();
public void sleep();
}

interface ant {
public void eat();
public void sleep();
}

public class interface44 implements ant,animal{
public void eat() {
      System.out.println("Mammal s");
   }

   public void sleep() {
      System.out.println("Mammal s");
   } 
 
public static void main(String args[]) {
      interface44 m = new interface44();
      m.eat();
      m.sleep();
   }
} 
