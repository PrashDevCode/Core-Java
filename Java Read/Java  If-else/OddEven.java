import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter your number= ");
        n=sc.nextInt();
        if(n%2==0)
            System.out.println("Even number");
        else 
            System.out.println("Odd number");     
            
        
    }
}
