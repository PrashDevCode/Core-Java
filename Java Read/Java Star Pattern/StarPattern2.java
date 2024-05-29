import java.util.Scanner;

public class StarPattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,j,k=1;
        System.out.print("Enter your number= ");
        n=sc.nextInt();
        // for( ;n>=1;n--) {
        //     for(j=1;j<=n;j++) {
                
        //         System.out.print("*");
        //     } 
        //     System.out.println();
        // } 
        // for( ;n>=1;n--) {
        //     for(j=1;j<=n;j++) {
                
        //         System.out.print(j);
        //     } 
        //     System.out.println();
        // } 
        // for( ;n>=1;n--) {
        //     for(j=1;j<=n;j++) {
                
        //         System.out.print(k);
        //     }  
        //     k=k+1;
        //     System.out.println();
        // } 
        for( ;n>=1;n--) {
            for(j=2;j<=n;j++) {
                
                System.out.print(j);
                
            } 
            
            System.out.println();
            
        }
    }
}
