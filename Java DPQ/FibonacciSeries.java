import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,x=0,y=1,z=0;
        System.out.print("Enter your number= ");
        n=sc.nextInt();
        while(z<=n) {
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
        }

    }
}
