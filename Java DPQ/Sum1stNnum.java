import java.util.Scanner;
public class Sum1stNnum {
    public static void main(String[] args) {
        int n,i,add=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number= ");
        n=sc.nextInt();
        i=1;
        while(i<=n) {
            add=add+i;
            i=i+1;
        } 
        System.out.println("Addition= "+add);

    }
}
