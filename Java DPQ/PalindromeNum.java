import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,z;
        System.out.print("Enter your number= ");
        n=sc.nextInt();
        z=n;
        while(n>0) {
            rev=(rev*10)+n%10;
            n=n/10;
        } 
        if(rev==z) {
            System.out.println("Palindrome number= "+rev);
        } 
        else {
            System.out.println("Not Palindrome number= "+rev);
        }
    }
}
