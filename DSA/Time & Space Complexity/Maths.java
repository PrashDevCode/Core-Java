import java.util.Scanner;
public class Maths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter your number= ");
        n=sc.nextInt();
        sum=n*(n+1)/2;
        System.out.println(sum);
    }
}
