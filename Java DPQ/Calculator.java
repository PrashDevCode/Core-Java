import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number= ");
        a=sc.nextInt();
        System.out.print("Enter your second number= ");
        b=sc.nextInt();
        System.out.print("Enter your Choice 1-> (+)  2-> (-)  3-> (*)  4-> (/)  5-> (%) \nEnter your Choice= ");
        ch=sc.nextInt();

        if(ch==1) {
            System.out.println("Addition= "+(a+b));
        }
        else if(ch==2) {
            System.out.println("Subtraction= "+(a-b));
        } 
        else if(ch==3) {
            System.out.println("Multiplication= "+(a*b));
        } 
        else if(ch==4) {
            System.out.println("Division= "+(a/b));
        } 
        else if(ch==5) {
            System.out.println("Remainder= "+(a%b));
        } 
        else {
            System.out.println("Invalid Choice");
        }
    }
}
