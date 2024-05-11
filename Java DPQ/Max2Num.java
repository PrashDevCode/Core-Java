import java.util.Scanner;

public class Max2Num {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your 1st number= ");
        a=sc.nextInt();
        System.out.print("Enter your 2nd number= ");
        b=sc.nextInt();
        if(a>b) {
            System.out.println("Max. number= "+ a);
        } 
        else {
            System.out.println("Max number= "+ b);
        }
    }
    
}
