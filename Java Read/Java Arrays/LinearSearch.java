public class LinearSearch {
    public static int LinearSearch(int a[], int r) {
        for(int i=0;i<a.length;i++) {
            if(a[i]==r){
                return i;
            } 
            
        } 
        return -1;
    } 
    public static void main(String[] args) {
        int a[]={2,4,6,8,10,12,14,16};
        int r=36;

        int index=LinearSearch(a,r);
        if(index==-1){
            System.out.println("Not found");
        } else {
            System.out.println("key is at index= "+ index); 
        }
    }
}
