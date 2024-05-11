import java.util.Scanner;

class add {

    int a,b; //class variable
    void getdata() { // input method
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 1st number= ");
        a=sc.nextInt();
        System.out.println("Enter your 2nd number= ");
        b=sc.nextInt();
    } 

    void putdata() {  // output method
        System.out.println("Addition=" + (a+b));
    } 
}

    class ClassObject { 
    public static void main(String a[]) {
        
        add aa=new add();
        aa.getdata();
        aa.putdata();
    }
}
