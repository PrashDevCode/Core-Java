 class Student {
    int roll;
    String name;
    static String Cname="TIT-CSE";
    Student (int x,String y) {
        roll=x;
        name=y;
    } 
    void display() {
        System.out.println("Roll= "+roll+" Name= "+name+" College name= "+Cname);
    } 
} 

class StaticDataMember {
    public static void main(String args[]){
        Student aa=new Student(111,"Prashant");
        Student bb=new Student(143,"Sarthak");
        Student cc=new Student(185,"Vivek");

        aa.display();
        bb.display();
        cc.display();

    }
}
