public class t31 {
    public static void main(String[]args){
        Deer12 d1=new Deer12();
        d1.eat();
    }
}

class Animal12{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer12{
    void eat(){
        System.out.println("eats grass");
    }
}