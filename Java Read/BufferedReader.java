import java.io.*;

public class BufferedReader {
    public static void main(String[] args)throws IOException {
        
        int a,b,c,sum;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1st number= ");
        a=Integer.parselnt(br.readLine());
        System.out.println("Enter 2nd number= ");
        b=Integer.parselnt(br.readLine());
        c=a+b;
        System.out.println("Addition="+c);


    }
}
