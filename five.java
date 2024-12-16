import java.util.Scanner;
public class five {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter age:");
      int age=sc.nextInt();
      System.out.println("Enter name:");
      String a=sc.next();
      System.out.println("Enter percent:");
      float f=sc.nextFloat();
     sc.close();
      System.out.println("name:"+a);
      System.out.println("age:"+age);
      System.out.println("percent:"+f);
    }
    
}
