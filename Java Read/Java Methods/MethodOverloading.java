class sum { 
void add(int x,int y) {
    int z=x+y;
    System.out.println("Sum= "+z);
} 
void add(int x, int y, int z) {
    int w=x+y+z;
    System.out.println("Sum= "+w);
} 
void add(float a, float b) {
    float c=a+b;
    System.out.println("Sum= "+c);
} 
}

public class MethodOverloading {
        public static void main(String[] args) {
            sum ob=new sum();
            ob.add(10,20);
            ob.add(10,20,30);
            ob.add(1,2);
    }
}