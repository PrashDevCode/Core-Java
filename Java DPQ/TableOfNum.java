import java.util.Scanner;
public class TableOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j=1;
        System.out.print("Enter number for Print Table= ");
        i=sc.nextInt();
        while(j<=10) {
            System.out.println(i+" x "+j+" = "+i*j);
            j=j+1;
        }

    }
}
