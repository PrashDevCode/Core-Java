public class PrintElementsArray {
    
    public void printArray(int[] arr) {
        int n=arr.length;
        for(int i=0;i<=n;i++) {
            System.out.println(arr[i] + " ");
        } 
            System.out.println();
    } 
    public static void main(String[] args) {
        ArrayUtil arrUtil=new ArrayUtil();
        arrUtil.printArray(new int[] {5,1,2,9,10});
    }
        
    
}
