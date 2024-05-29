import java.util.Scanner;
public class GEL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("a = ");
        a=sc.nextInt();
        System.out.print("b = ");
        b=sc.nextInt();
        if (a>b)
            System.out.println(a+ " is greater than "+b);
        else if (b>a) 
            System.out.println(b+ " is greater than "+a);  
        else 
            System.out.println(a+" & " +b+ " is equal");      
    }
}
