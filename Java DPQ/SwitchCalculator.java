import java .util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number= ");
        a=sc.nextInt();
        System.out.print("Enter your second number= ");
        b=sc.nextInt();

        System.out.println("Enter your choice 1-> Add  2-> Subtract  3-> Divide  4-> Multiply  5-> Remaninder\nEnter your choice= ");
        ch=sc.nextInt();
        
        switch(ch) {
            case 1:
                    System.out.println("Addition= "+(a+b));
                    break;
            case 2:
                    System.out.println("Subtraction= "+(a-b));
                    break;
            case 3:
                    System.out.println("Division= "+(a/b));
                    break;
            case 4:
                    System.out.println("Multiplication= "+(a*b));     
                    break;
            case 5: 
                    System.out.println("Remainder= "+(a%b));
                    break;
            default:
                    System.out.println("Invalid Choice");  
                                                        
        }
    }
}