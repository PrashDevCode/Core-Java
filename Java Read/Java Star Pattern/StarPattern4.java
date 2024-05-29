import java.util.Scanner;
public class StarPattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,b,i,j;
        System.out.print("Enter your number= ");
        n=sc.nextInt();
        for(i=1;i<=n;i++) {
            for(b=1;b<i;b++)
                System.out.print(" ");
            
            for(j=1;j<=n+1-i;j++)
                System.out.print("*");
                
                System.out.println();
        }
    }
}
