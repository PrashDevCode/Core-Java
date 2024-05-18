import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n,z,count=0,digit,i,prod,sum=0;
        int n,z,count=0;
        System.out.print("Enter your number= ");
        n=sc.nextInt();
        z=n;
        while(z>0) {
            count=count+1;
            z/=10;
            // }  
            // z=n;
            // while(z>0) {
                
                // digit=z%10;
                // prod=1;
                // for(i=1;i<=count;i++) 
                // prod=prod*digit;
                
                // sum=sum+prod;
                // z=z/10;
            } 
            System.out.println("No. of digits= "+count);
            // if(sum==n)
            // System.out.println("Armstrong number");
            // else 
            // System.out.println("Not Armstrong number");
           
    }  
}
