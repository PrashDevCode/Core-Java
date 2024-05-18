import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args) {
        int n,prod=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number= ");
        n=sc.nextInt();
        while(n!=0) {
            // prod=prod*n%10;
            // n=n/10;
            int digit=n%10;
            prod =prod* digit;
            n =n/10;
        } 
            System.out.println("Product= "+prod);
    }
}
