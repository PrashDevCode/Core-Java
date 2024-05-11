import java.util.Scanner;
public class PosiNegiZero { 
    public static void main(String[] args) {
        int PN;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number= ");
        PN=sc.nextInt();
        
        if(PN>0) {
            System.out.println(PN+ " is a Positive number");
        } 
        else if(PN<0) {
            System.out.println(PN+ " is a Negative number");
        } 
        else {
            System.out.println(PN+ " is a Zero");
        }
        
    }
    
}
