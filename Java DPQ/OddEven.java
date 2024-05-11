import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int OE;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number= ");
        OE=sc.nextInt();
        if(OE%2==0) {
            System.out.println(OE +" is a Even number");
        } 
        else {
            System.out.println(OE + " is a Odd number");
        }
       
    }
}
