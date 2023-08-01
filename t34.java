public class t34 {
    public static void main(String[]args){
        Student s1=new Student();
        s1.schoolName12="JMV";

        Student s2=new Student();
        System.out.println(s2.schoolName12);
    }
}

class Student{
    String name;
    int rollNo;

    static String schoolName12;

    void setName(String name){
        this.name=name;
    }

    String getName(){
        return this.name;
    }
}