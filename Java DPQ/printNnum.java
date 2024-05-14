import java.util.Scanner;

public class printNnum {
    public static void main(String[] args) {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number= ");
        n=sc.nextInt();

        i=1;
        while(i<=n) {
            System.out.println(i);
            i++;
        }
    }
}
