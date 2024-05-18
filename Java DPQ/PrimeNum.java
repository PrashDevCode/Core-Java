import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,count=0;
        System.out.print("Enter your number= ");
        n=sc.nextInt();
        i=1;
        while(i<=n) {
            if(n%i==0) 
                count=count+1;
                i=i+1;
        } 
            if(count==2) 
                System.out.println(n+" is a Prime number");
            else 
                System.out.println("Not Prime number");    
    }
}
