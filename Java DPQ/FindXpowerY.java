import java.util.Scanner;
public class FindXpowerY {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int x,y,prod=1;
       System.out.print("Enter base= "); 
       x=sc.nextInt();
       System.out.print("Enter power= ");
       y=sc.nextInt();

       while(y>0) {
        prod*=x;
        y--;

       } 
        System.out.println("Value= "+prod);
    }
}
