import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,rev=0;
        System.out.print("Enter your number for its Reverse= ");
        n=sc.nextInt();
        while(n>0) {
            rev=(rev*10)+n%10;
            n=n/10;
        }
        System.out.println("Reverse= "+rev);
    } 
}
