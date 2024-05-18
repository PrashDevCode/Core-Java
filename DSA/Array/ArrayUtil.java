// package DSA.Array;

public class ArrayUtil {
    public void printArray(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]+" ");
        } 
            System.out.println();
    } 
        public void arrayDemo() {
            int[] myArray=new int[5];
            // printArray(myArray);
           myArray[0] = 5;
           myArray[1] = 4;
           myArray[2] = 3;
           myArray[3] = 2;
           myArray[4] = 1; 
           myArray[1] = 9; 
           myArray[3] = 7; 

           printArray(myArray);
           System.out.println(myArray.length);
           System.out.println(myArray[myArray.length-3]);

           int[] arr={1,2,3,4};
           printArray(arr);
        } 
            public static void main(String[] args) {
                ArrayUtil arrUtil=new ArrayUtil();
                arrUtil.arrayDemo();
            }
        
    }
    

