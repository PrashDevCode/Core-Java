import java.util.Scanner;
public class Reverse {
    int n;
    void getdata(int i) {
        n=i;
    } 
    void putdata() {
        int rev=0;
        while(n>0) {
            rev=(rev*10)+n%10;
            n=n/10;
        } 
        System.out.print("Reverse= "+rev);
    } 
    public static void main(String[] args) {
        int m;
        Reverse aa=new Reverse();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number to find its Reverse= ");
        m=sc.nextInt();
        aa.getdata(m);
        aa.putdata();
    }
    
}
