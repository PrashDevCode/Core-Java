import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        int n;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter your age= ");
      n=sc.nextInt();
      if (n>=18) 
            System.out.println("Adult");
      else 
            System.out.println("Not Adult");  
        
    }
}