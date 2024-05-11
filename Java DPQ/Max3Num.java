import java.util.Scanner;

public class Max3Num { 
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your 1st numbers= ");
        a=sc.nextInt();
        System.out.print("Enter your 2nd numbers= ");
        b=sc.nextInt();
        System.out.print("Enter your 3rd numbers= ");
        c=sc.nextInt();

        if(a>b && a>c) {
            System.out.println("Max number= "+a);
        } 
        else if(b>a && b>c) {
            System.out.println("Max number= "+b);
        } 
        else {
            System.out.println("Max number= "+c);
        }
        
    }
    
}
