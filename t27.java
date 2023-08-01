public class t27 {
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Divyangna";
        s1.rollNo=456;
        s1.password="abcd";

        Student s2=new Student(s1);
        s2.password="xyz";

        System.out.println(s1.name);
        //Student s2=new Student("Divyangna");
        //Student s3=new Student(123);
        //System.out.println(s2.name);
        //System.out.println(s3.rollNo);
    }
}

class Student{
    String name;
    int rollNo;
    String password;

    Student(Student s1){
        this.name=s1.name;
        this.rollNo=s1.rollNo;
    }

    Student(){
        System.out.println("constructor is called...");
    }

    Student(String name){
        this.name=name;
    }

    Student(int rollNo){
        this.rollNo=rollNo;
    }
}