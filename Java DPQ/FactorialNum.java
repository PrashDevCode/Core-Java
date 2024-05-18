import java.util.Scanner;
public class FactorialNum {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in) ;
      int n,fact=1;
      System.out.print("Enter your number= "); 
      n=sc.nextInt();
      while(n>0) {
        fact*=n;
        n-=1;
      } 
        System.out.println("Factorial of number= "+fact);
    }
}
