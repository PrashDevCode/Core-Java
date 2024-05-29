import java.util.Scanner;
public class StarPattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j,s;
        System.out.print("Enter your number= ");
        n=sc.nextInt();
        for(i=1;i<=n;i++) {
            for(s=1;s<=n-i;s++)
                System.out.print(" ");

            for(j=1;j<=i;j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
